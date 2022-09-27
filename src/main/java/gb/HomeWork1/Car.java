// Основываясь на примере с урока продолжить развивать систему классов, описывающих структуру и
// функционирование легкового автомобиля. Добавить сам класс автомобиля, который будет включать
// созданную нами базу. Помимо базы добавить такие компоненты, как двери, кондиционер, рулевое
// управление и др. Наладить их взаимодействие.

package gb.HomeWork1;

public class Car {
    private Base base;
    private Door[] doors;
    private Steering steering;
    private Сonditioner conditioner;
    private Light light;

    public Car() {
        base = new Base();
        doors = new Door[5];
        doors[0] = new Door("Передняя правая");
        doors[1] = new Door("Передняя левая");
        doors[2] = new Door("Задняя правая");
        doors[3] = new Door("Задняя левая");
        doors[4] = new Door("Задняя");
        steering = new Steering(45, 45);
        conditioner = new Сonditioner();
        light = new Light();
    }

    public void BlockAllDoors() {
        for (Door door : doors) {
            door.Block();
        }
    }

    public void UnlockllDoors() {
        for (Door door : doors) {
            door.Unlock();
        }
    }

    public void Start() {
        base.Start();
        conditioner.On();
        light.HeadLightsOn();
    }

    public void BeginMove() {
        BlockAllDoors();
        steering.Straight();
        base.Drive();
    }

    public void TurnLeft(int angle) {
        light.LeftTurnSignalOn();
        steering.LeftTurn(angle);
    }

    public void TurnRight(int angle) {
        light.RightTurnSignalOn();
        steering.RightTurn(angle);
    }

    public void MoveStraight() {
        light.LeftTurnSignalOff();
        light.RightTurnSignalOff();
        steering.Straight();
    }

    public void EndMove() {
        UnlockllDoors();
    }

    public void Stop() {
        light.HeadLightsOff();
        conditioner.Off();
        base.Stop();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.Start();
        car.BeginMove();
        car.TurnLeft(20);
        car.MoveStraight();
        car.TurnRight(10);
        car.EndMove();
        car.Stop();
    }


}
