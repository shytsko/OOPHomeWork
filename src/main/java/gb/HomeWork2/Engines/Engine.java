package gb.HomeWork2.Engines;

public abstract class Engine {
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
}
