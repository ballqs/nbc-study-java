package constructor;

public class Car {
    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    // 오버로딩
    public Car(String modelName) {
        this("Test" , "test");
        this.model = modelName;
        System.out.println("첫 번째 생성자가 호출되었습니다.");
        //여기서 호출시 에러 : this()' 호출은 생성자 본문의 첫 번째 구문이어야 합니다.
        //this("Test" , "test");
    }
    public Car(String modelName, String colorName) {
        this.model = modelName;
        this.color = colorName;
        System.out.println("두 번째 생성자가 호출되었습니다.");
    }

    public Car(String modelName, String colorName, double priceValue) {
        // 매개변수명과 객체의 필드명이 동일할 경우 오류가 발생하지는 않지만 해당 변수들은 객체의 필드가 아닌 가장 가까운 매개변수명을 가리키게 됨
        // 그래서 this. 를 앞에 붙이는게 개발자들의 약속이라고 볼수 있음!
        model = modelName;
        color = colorName;
        price = priceValue;
        System.out.println("세 번째 생성자가 호출되었습니다.");
    }

    double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵");
    }

    Car returnInstance() {
        return this;
    }
}
