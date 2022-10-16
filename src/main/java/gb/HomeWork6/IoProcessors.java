package gb.HomeWork6;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static gb.HomeWork6.ServerConfig.WWW;

public class IoProcessors {

    public static final Map<Predicate<Path>, BiConsumer<Path, PrintWriter>> PROCESSORS = Map.of(

            Files::notExists,
            (path, writer) -> {
                writer.println("HTTP/1.1 404 OK");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.println("<h1>File " + path + "not found</h1>");
            },

            Files::isDirectory,
            (path, writer) -> {
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                Path wwwPath = Path.of(WWW);
                writer.println("<h1>\\" + wwwPath.relativize(path) + "</h1>");

                if(!wwwPath.equals(path))
                    writer.println(String.format("<p><a href=\"\\%s\">%s</a></p>",
                            wwwPath.relativize(path.getParent()),
                            ".."));

                List<Path> nestedPaths;
                try (Stream<Path> filesStream = Files.walk(path, 1)) {
                    nestedPaths = filesStream.collect(Collectors.toList());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                for (Path nestedPath : nestedPaths) {
                    if(!nestedPath.equals(path)) {
                        writer.println(String.format("<p><a href=\"\\%s\">%s</a></p>",
                                wwwPath.relativize(nestedPath),
                                nestedPath.getFileName().toString()));
                    }
                }
                // TODO дописать вывод списка файлов в данной директории
            },

            path -> !Files.isReadable(path),
            (path, writer) -> {
                writer.println("HTTP/1.1 403 OK");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.println("<h1>File not readable</h1>");
            },

            Files::isRegularFile,
            (path, writer) -> {
                try {
                    writer.println("HTTP/1.1 200 OK");
                    writer.println("Content-Type: text/html; charset=utf-8");
                    writer.println();
                    Files.newBufferedReader(path).transferTo(writer);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    );
}
