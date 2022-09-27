


package gb.HomeWork1;

public class Steering {
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
        System.out.printf("Поворот налево на %d градусов%n", -this.angle);
    }

    public void RightTurn(int angle){
        this.angle = Math.min(angle, maxLeftAngle);
        System.out.printf("Поворот направо на %d градусов%n", this.angle);
    }

    public void Straight() {
        this.angle = 0;
        System.out.println("Движение прямо");
    }

    public int getAngle() {
        return this.angle;
    }
}
