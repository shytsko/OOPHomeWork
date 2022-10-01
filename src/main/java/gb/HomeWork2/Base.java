package gb.HomeWork2;

import gb.HomeWork2.Engines.AbstractEngine;
import gb.HomeWork2.Engines.ElectricEngine;
import gb.HomeWork2.Transmissions.AbstractTransmission;
import gb.HomeWork2.Transmissions.AutomaticTransmission;
import gb.HomeWork2.Transmissions.ManualTransmission;

import java.util.List;

public class Base {
    private AbstractEngine engine;
    private Wheel[] wheels;
    private AbstractTransmission transmission;

    public Base() {
        engine = new ElectricEngine();
        wheels = new Wheel[4];
        wheels[0] = new Wheel("Переднее правое");
        wheels[1] = new Wheel("Переднее левое");
        wheels[2] = new Wheel("Заднее правое");
        wheels[3] = new Wheel("Заднее левое");
        transmission = new AutomaticTransmission();
    }

    public List<Checkable> GetCheckable() {
        return List.of(engine, wheels[0], wheels[1], wheels[2], wheels[3], transmission);
    }

    public void Start() {
        engine.Start();
    }

    public void Drive () {
        if (engine.getWork()) {
            transmission.switchGear(1);
            engine.SetPower(50);
            for (Wheel wheel : wheels)
                wheel.rotate();
        }
    }

    public void Stop() {
        engine.Stop();
    }
}
