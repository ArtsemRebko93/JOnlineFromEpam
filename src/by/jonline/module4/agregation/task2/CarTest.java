package by.jonline.module4.agregation.task2;

public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.addFuel(60);
        car.showCarBrand();
        car.move();
        car.changeWheel("2");
        System.out.println(car.toString());
    }
}
