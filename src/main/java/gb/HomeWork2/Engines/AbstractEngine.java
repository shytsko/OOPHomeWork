package gb.HomeWork2.Engines;

import gb.HomeWork2.Checkable;

public abstract class AbstractEngine implements Checkable {
    private Boolean work;

    public void Start () {
        this.work = true;
        StartInternal();
    }

    protected abstract void StartInternal();

    public void Stop () {
        this.work = false;
        StopInternal();
    }

    protected abstract void StopInternal();

    public void SetPower(int level) {
        if (this.work) {
            SetPowerInternal(level);
        }
    }

    protected abstract void SetPowerInternal(int level);

    public Boolean getWork() {
        return work;
    }

    public void Log(String message) {
        System.out.println("Engine: " + message);
    }
}
