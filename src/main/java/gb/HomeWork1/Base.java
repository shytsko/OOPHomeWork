package gb.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Base {
    private Engine engine;
    private Wheel[] wheels;
    private Transmission transmission;

    public Base() {
        engine = new Engine();
        wheels = new Wheel[4];
        wheels[0] = new Wheel("Переднее правое");
        wheels[1] = new Wheel("Переднее левое");
        wheels[2] = new Wheel("Заднее правое");
        wheels[3] = new Wheel("Заднее левое");
        transmission = new Transmission();
    }

    public void Start() {
        engine.start();
    }

    public void Drive () {
        if (engine.getWork()) {
            transmission.switchGear(1);
            for (Wheel wheel : wheels)
                wheel.rotate();
        }
    }

    public void Stop() {
        engine.stop();
    }
}
