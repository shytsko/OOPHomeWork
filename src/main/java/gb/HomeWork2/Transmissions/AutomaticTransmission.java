package gb.HomeWork2.Transmissions;

public class AutomaticTransmission extends AbstractTransmission {
    @Override
    public boolean Check() {
        Log("Автоматическая коробка передач исправна");
        return true;
    }

    @Override
    public void switchGear(int numberGear) {
        if(numberGear < -1 || numberGear > 5) {
            Log("Получено не допустимая команда");
        }
        else {
            if (numberGear == 0)
                Log("Коробка передач в нейтральном положении");
            else if (numberGear >= 1 && numberGear <= 5)
                Log(String.format("Включена передача %d", numberGear));
            else
                Log("Включена задняя передача");
            currentGear = numberGear;
        }
    }
}
