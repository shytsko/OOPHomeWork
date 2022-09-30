package gb.HomeWork2;

public class Steering implements Checkable {
    int angle;
    int maxLeftAngle;
    int maxRightAngle;

    public Steering(int maxLeftAngle, int maxRightAngle) {
        this.maxLeftAngle = maxLeftAngle;
        this.maxRightAngle = maxRightAngle;
        this.angle = 0;
    }

    public void LeftTurn(int angle){
        this.angle = -(Math.min(angle, maxLeftAngle));
        Log(String.format("Поворот налево на %d градусов", this.angle));
    }

    public void RightTurn(int angle){
        this.angle = Math.min(angle, maxLeftAngle);
        Log(String.format("Поворот направо на %d градусов", this.angle));
    }

    public void Straight() {
        this.angle = 0;
        Log("Движение прямо");
    }

    public int getAngle() {
        return this.angle;
    }

    @Override
    public boolean Check() {
        Log("Рулевое управление исправно");
        return true;
    }

    public void Log(String message) {
        System.out.println("Steering: " + message);
    }
}
