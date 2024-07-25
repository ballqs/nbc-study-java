package lambda;

class Car {
    private final String company; // 자동차 회사
    private final String model; // 자동차 모델

    private final boolean hasParkingTicket;
    private final int parkingMoney;

    public Car(String company, String model, boolean hasParkingTicket, int parkingMoney) {
        this.company = company;
        this.model = model;
        this.hasParkingTicket = hasParkingTicket;
        this.parkingMoney = parkingMoney;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public boolean hasParkingTicket() {
        return hasParkingTicket;
    }

    public int getParkingMoney() {
        return parkingMoney;
    }

    // static형식으로 생성?
    public static boolean hasTicket (Car car) {
        return car.hasParkingTicket;
    }

    public static boolean noTicketButMoney (Car car) {
        return !car.hasParkingTicket && car.getParkingMoney() > 1000;
    }
}