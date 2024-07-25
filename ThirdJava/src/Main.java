public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();    // 객체 생성
        car.horn();
        
        System.out.println("car.company : " + car.company);
        System.out.println("car.model : " + car.model);
        System.out.println("car.color : " + car.color);
        System.out.println("car.price : " + car.price);
        System.out.println("car.speed : " + car.speed);
        System.out.println("car.gear : " + car.gear);
        System.out.println("car.lights : " + car.lights);

        Car car2 = new Car();

        System.out.println("페달 밝기 전 car.gear = " + car.gear);
        //메서드 호출 및 반환값을 저장
        double speed = car.gasPedal(100, 'D');
        System.out.println("speed = " + speed);

        boolean lights = car.onOffLight();
        System.out.println("lights = " + lights);

        System.out.println("페달 밝고 난 후의 car.gear = " + car.gear);

        car.carSpeed(100 , 200 , 300);
    }

    // 메서드는 반환값이 없을때 void를 사용
    public void voidMethod() {

    }

    // 반환값이 있을때는 int , String 등 데이터 타입을 사용한다.
    // 반환값이 int이기 때문에 아래와 같이 표현
    public int intMethod() {
        return 0;
    }

    // 메서드의 매개변수에는 가변길이로 선언할수도 있다!
    // 아래와 같이 ...a 라고 사용하면 가변의 길이로 받아온다는 것이다.
    public void test(int ...a) {
        // 외부 접근
        Car car = new Car();
        // 내부 접근
        voidMethod();
    }
}