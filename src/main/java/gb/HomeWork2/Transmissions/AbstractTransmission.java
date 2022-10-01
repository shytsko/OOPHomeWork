package gb.HomeWork2.Transmissions;

import gb.HomeWork2.Checkable;

public abstract class AbstractTransmission implements Checkable {
    protected int currentGear;

    public AbstractTransmission() {
        this.currentGear = 0;
    }

    public abstract void switchGear (int numberGear);


    public int getCurrentGear() {
        return currentGear;
    }

    public void Log(String message) {
        System.out.println("Transmission: " + message);
    }
}
