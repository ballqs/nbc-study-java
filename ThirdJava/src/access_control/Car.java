package access_control;

public class Car {
    private String model;
    private String color;
    private String type;
    private int price;
    private int speed;

    public Car() {
        this("모델" , "색상" , "타입" , 500000 , 200);
    }

    public Car(String model, String color, String type, int price, int speed) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.price = price;
        this.speed = speed;
    }

    // setter , getter 설정
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
