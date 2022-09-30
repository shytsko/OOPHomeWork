package gb.HomeWork2.Engines;

public class GazEngine extends Engine{
    @Override
    protected void StartInternal() {
        System.out.println("Бензиновый двигатель запущен");
    }

    @Override
    protected void StopInternal() {
        System.out.println("Бензиновый двигатель остановлен");
    }

    @Override
    protected void SetPowerInternal(int level) {
        System.out.printf("Дроссельная заслонка открыта на %d%%%n", level);
    }
}
