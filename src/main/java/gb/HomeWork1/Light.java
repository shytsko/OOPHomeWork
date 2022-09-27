package gb.HomeWork1;

public class Light {

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
            System.out.println("Головной свет включен");
            headLightsOn = true;
        }
    }

    public void HeadLightsOff() {
        if(headLightsOn) {
            System.out.println("Головной свет выключен");
            headLightsOn = false;
        }
    }

    public void RightTurnSignalOn() {
        if(!rightTurnSignalOn) {
            System.out.println("Указатель правого поворота включен");
            rightTurnSignalOn = true;
        }
    }

    public void RightTurnSignalOff() {
        if(rightTurnSignalOn) {
            System.out.println("Указатель правого поворота выключен");
            rightTurnSignalOn = false;
        }
    }

    public void LeftTurnSignalOn() {
        if(!leftTurnSignalOn) {
            System.out.println("Указатель левого поворота включен");
            leftTurnSignalOn = true;
        }
    }

    public void LeftTurnSignalOff() {
        if (leftTurnSignalOn) {
            System.out.println("Указатель левого поворота выключен");
            leftTurnSignalOn = false;
        }
    }
}
