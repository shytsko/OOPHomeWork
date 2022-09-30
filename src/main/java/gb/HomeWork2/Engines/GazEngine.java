package gb.HomeWork2.Engines;

public class GazEngine extends AbstractEngine {
    @Override
    protected void StartInternal() {
        Log("Бензиновый двигатель запущен");
    }

    @Override
    protected void StopInternal() {
        Log("Бензиновый двигатель остановлен");
    }

    @Override
    protected void SetPowerInternal(int level) {
        Log(String.format("Дроссельная заслонка открыта на %d%%", level));
    }

    @Override
    public boolean Check() {
        Log("Бензиновый двигатель исправен");
        return true;
    }
}
