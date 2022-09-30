package gb.HomeWork2;

public class Light implements Checkable {

    private boolean headLightsOn;
    private boolean rightTurnSignalOn;
    private boolean leftTurnSignalOn;

    public Light() {
        this.headLightsOn = false;
        this.rightTurnSignalOn = false;
        this.leftTurnSignalOn = false;
    }


    public void HeadLightsOn() {
        if(!headLightsOn) {
            Log("Головной свет включен");
            headLightsOn = true;
        }
    }

    public void HeadLightsOff() {
        if(headLightsOn) {
            Log("Головной свет выключен");
            headLightsOn = false;
        }
    }

    public void RightTurnSignalOn() {
        if(!rightTurnSignalOn) {
            Log("Указатель правого поворота включен");
            rightTurnSignalOn = true;
        }
    }

    public void RightTurnSignalOff() {
        if(rightTurnSignalOn) {
            Log("Указатель правого поворота выключен");
            rightTurnSignalOn = false;
        }
    }

    public void LeftTurnSignalOn() {
        if(!leftTurnSignalOn) {
            Log("Указатель левого поворота включен");
            leftTurnSignalOn = true;
        }
    }

    public void LeftTurnSignalOff() {
        if (leftTurnSignalOn) {
            Log("Указатель левого поворота выключен");
            leftTurnSignalOn = false;
        }
    }

    @Override
    public boolean Check() {
        Log("Световые приборы исправны");
        return true;
    }

    public void Log(String message) {
        System.out.println("Light: " + message);
    }
}
