package access_control;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        
        // setter로 값 설정
        car.setColor("red");
        
        // getter로 값 가져오기
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
    }
}
