package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Car> carsWantToPark = new ArrayList<>();
        ArrayList<Car> parkingLot = new ArrayList<>();

        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        // 기존 방식
//        parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
//        parkingLot.addAll(parkingCarWithMoney(carsWantToPark));

        // Car::함수명 방식
//        parkingLot.addAll(parkCars(carsWantToPark , Car::hasTicket));
//        parkingLot.addAll(parkCars(carsWantToPark , Car::noTicketButMoney));

        // 람다 방식
        parkingLot.addAll(parkCars(carsWantToPark , (Car car) -> car.hasParkingTicket()));
        parkingLot.addAll(parkCars(carsWantToPark , (Car car) -> !car.hasParkingTicket() && car.getParkingMoney() > 1000 ));


        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }


    }

//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (car.hasParkingTicket()) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }
//
//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
//                cars.add(car);
//            }
//        }
//
//        return cars;
//    }

    // parkingCarWithTicket 와 parkingCarWithMoney 함수를 하나로 합치기
    // 매개 변수에 인터페이스를 받아서 진행하는 방법
    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<>();
        for (Car car : carsWantToPark) {
            if (function.flag(car)) {
                cars.add(car);
            }
        }
        return cars;
    }
}