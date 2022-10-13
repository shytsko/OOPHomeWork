package gb.HomeWork5.HttpServer;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            int count = 0;

            for(;;) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter writer = new PrintWriter(
                        socket.getOutputStream());

                while (!reader.ready());
                String fileName = null;
                while (reader.ready()) {
                    String line = reader.readLine();
                    if(line.startsWith("GET")) {
                        String[] parse = line.split(" ");
                        if(parse[1].equals("/"))
                            fileName = "/index.html";
                        else
                            fileName = parse[1];
                    }
                    System.out.println(line);
                }

                List<String> outputData = new ArrayList<>();

                try (Scanner sc = new Scanner(new File("www" + fileName))) {
                    outputData.add("HTTP/1.1 200 OK");
                    outputData.add("Content-Type: text/html; charset=utf-8");
                    outputData.add("");
                    while (sc.hasNextLine())
                        outputData.add(sc.nextLine());
                }
                catch (Exception ex) {
                    System.out.println("Не удалось прочитать файл.");
                    System.out.println(ex.getMessage());
                    outputData.clear();
                    outputData.add("HTTP/1.1 404 Not Found");
                }

                for (String data : outputData)
                    writer.println(data);

                writer.flush();
                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
