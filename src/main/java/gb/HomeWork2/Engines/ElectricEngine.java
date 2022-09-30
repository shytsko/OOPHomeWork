package gb.HomeWork2.Engines;

public class ElectricEngine extends AbstractEngine {
    @Override
    protected void StartInternal() {
        Log("Электрический двигатель запущен");
    }

    @Override
    protected void StopInternal() {
        Log("Электрический двигатель остановлен");
    }

    @Override
    protected void SetPowerInternal(int level) {
        Log(String.format("ШИМ двигателя %d%%", level));
    }

    @Override
    public boolean Check() {
        Log("Электрический двигатель исправен");
        return true;
    }
}
