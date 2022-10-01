// Придумать ешё один пример использования абстрактного класса и интерфейса.
// Основываясь на коде с урока

package gb.HomeWork2;


import java.util.ArrayList;
import java.util.List;

public class Car {
    private Base base;
    private List<Door> doors;
    private Steering steering;
    private Сonditioner conditioner;
    private Light light;

    private List<Checkable> checkList;

    public Car() {
        base = new Base();
        doors = new ArrayList<>(5);
        doors.add(new Door("Передняя правая"));
        doors.add(new Door("Передняя левая"));
        doors.add(new Door("Задняя правая"));
        doors.add(new Door("Задняя левая"));
        doors.add(new Door("Задняя"));
        steering = new Steering(45, 45);
        conditioner = new Сonditioner();
        light = new Light();
        checkList = new ArrayList<>();
        checkList.addAll(base.GetCheckable());
        checkList.addAll(doors);
        checkList.add(steering);
        checkList.add(conditioner);
        checkList.add(light);
    }

    public boolean CheckAll(){
        boolean allCorrect=true;
        for (Checkable component : checkList) {
            if(!component.Check()) {
                if(component instanceof Repairable) {
                    ((Repairable) component).Repair();
                    if(!component.Check())
                        allCorrect = false;
                }
                else
                    allCorrect = false;
            }
        }
        return allCorrect;
    }

    public void BlockAllDoors() {
        for (Door door : doors) {
            door.Block();
        }
    }

    public void UnlockDoors() {
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
        UnlockDoors();
    }

    public void Stop() {
        light.HeadLightsOff();
        conditioner.Off();
        base.Stop();
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("---------------------");
        if(car.CheckAll()) {
            System.out.println("---------------------");
            System.out.println("Можно ехать");
            car.Start();
            car.BeginMove();
            car.TurnLeft(20);
            car.MoveStraight();
            car.TurnRight(10);
            car.EndMove();
            car.Stop();
        }
        else {
            System.out.println("---------------------");
            System.out.println("Автомобиль не исправен, ехать нельзя!!!");
        }
    }


}
