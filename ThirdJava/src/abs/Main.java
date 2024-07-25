package abs;

public class Main {
    public static void main(String[] args) {
        Car car1 = new ZenesisCar();
        car1.horn();

        Car car2 = new BenzCar();
        car2.horn();

        Car car3 = new AudiCar();
        car3.horn();
    }
}
