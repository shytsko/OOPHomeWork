package gb.HomeWork2.Engines;

public class DizelEngine extends AbstractEngine {
    @Override
    protected void StartInternal() {
        Log("Дизельный двигатель запущен");
    }

    @Override
    protected void StopInternal() {
        Log("Дизельный двигатель остановлен");
    }

    @Override
    protected void SetPowerInternal(int level) {
        Log(String.format("Подача топлива %d%%", level));
    }

    @Override
    public boolean Check() {
        Log("Дизельный двигатель исправен");
        return true;
    }
}
