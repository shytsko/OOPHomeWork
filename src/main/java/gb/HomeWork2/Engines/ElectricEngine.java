package gb.HomeWork2.Engines;

public class ElectricEngine extends Engine {
    @Override
    protected void StartInternal() {
        System.out.println("Электрический двигатель запущен");
    }

    @Override
    protected void StopInternal() {
        System.out.println("Электрический двигатель остановлен");
    }

    @Override
    protected void SetPowerInternal(int level) {
        System.out.printf("ШИМ двигателя %d%%%n", level);
    }
}
