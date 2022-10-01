package gb.HomeWork2.Transmissions;

public class ManualTransmission extends AbstractTransmission {
    @Override
    public void switchGear(int numberGear) {
        switch (numberGear) {
            case 0:
                SetNeutral();
                break;
            case 1:
                SetFirstGear();
                break;
            case 2:
                SetSecondGear();
                break;
            case 3:
                SetThirdGear();
                break;
            case 4:
                SetFourthGear();
                break;
            case 5:
                SetFifthGear();
                break;
            case -1:
                SetReverseGear();
                break;
            default:
                Log("Получено не допустимая команда");
        }
    }

    private void SetNeutral() {
        if (this.currentGear == 1 || this.currentGear == 3 || this.currentGear == 5)
            Log("Рычаг вниз");
        else if (this.currentGear == 2 || this.currentGear == 4 || this.currentGear == -1) {
            Log("Рычаг вверх");
        }
        Log("Коробка передач в нейтральном положении");
        this.currentGear = 0;
    }

    private void SetFirstGear() {
        if(this.currentGear != 0)
            SetNeutral();
        Log("Рычаг влево и вверх");
        Log("Включена первая передача");
        this.currentGear = 1;
    }

    private void SetSecondGear() {
        if(this.currentGear != 0)
            SetNeutral();
        Log("Рычаг влево и вниз");
        Log("Включена вторая передача");
        this.currentGear = 2;
    }

    private void SetThirdGear() {
        if(this.currentGear != 0)
            SetNeutral();
        Log("Рычаг вверх");
        Log("Включена третья передача");
        this.currentGear = 3;
    }

    private void SetFourthGear() {
        if(this.currentGear != 0)
            SetNeutral();
        Log("Рычаг вниз");
        Log("Включена четвертая передача");
        this.currentGear = 4;
    }

    private void SetFifthGear() {
        if(this.currentGear != 0)
            SetNeutral();
        Log("Рычаг вправо и вверх");
        Log("Включена пятая передача");
        this.currentGear = 5;
    }

    private void SetReverseGear() {
        if(this.currentGear != 0)
            SetNeutral();
        Log("Разблокировать огпаничитель. Рычаг вправо и вниз");
        Log("Включена задняя передача");
        this.currentGear = -1;
    }

    @Override
    public boolean Check() {
        Log("Механическая коробка передач исправна");
        return true;
    }
}
