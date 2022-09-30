package gb.HomeWork2.Engines;

public class DizelEngine extends Engine {
    @Override
    protected void StartInternal() {
        System.out.println("Дизельный двигатель запущен");
    }

    @Override
    protected void StopInternal() {
        System.out.println("Дизельный двигатель остановлен");
    }

    @Override
    protected void SetPowerInternal(int level) {
        System.out.printf("Подача топлива %d%%%n", level);
    }
}
