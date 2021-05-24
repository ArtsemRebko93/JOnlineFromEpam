package by.jonline.module4.agregation.task2;

/*
Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Car {

    private int fuel;
    private final int FUEL_MAX = 62;
    private CarBrand brand;
    private CarColor color;
    private Wheel [] wheels = {new Wheel(),new Wheel(),new Wheel(),new Wheel()};
    private Engine engine = new Engine(EngineType.AMG);

    public Car () {
        fuel = 5;
        brand = CarBrand.AUDI;
        color = CarColor.DARK;
    }

    public Car (int fuel)  {
        if (fuel > FUEL_MAX) {
            throw new IllegalArgumentException("Превышен лимит максимально возможного топлива в баке.");
        }
        this.fuel = fuel;
    }

    public Car(int fuel, CarBrand brand, CarColor color) {
        this.fuel = fuel;
        this.brand = brand;
        this.color = color;
    }

    public void addFuel (int fuel) {
        if (fuel > (FUEL_MAX - this.fuel)) {
            System.out.println("Бак запрален полностью. Отаток " + (fuel +this.fuel - FUEL_MAX) + "Вам в канистру");
            this.fuel = FUEL_MAX;
        } else {
            this.fuel += fuel;
            System.out.println("Бак заправлен. Текущее значение " + this.fuel);
        }
    }

    public void changeWheel(String numberOfWheel) {
        wheels[Integer.parseInt(numberOfWheel)] = new Wheel();
    }

    @Override
    public String toString() {
        return "Car:" +
                "fuel =" + fuel +
                ", brand =" + brand +
                ", color =" + color +
                ", engine =" + engine.type;
    }

    public void move () {
        engine.run();
        wheels[0].run();
        System.out.println("Машина приводится в движение.");
    }

    private class Wheel {

        public void run () {
            System.out.println("Колеса начинают крутиться.");

        }

    }

    private class Engine {
        private EngineType type;

        public Engine (EngineType type) {
            this.type = type;
        }

        public void run () {
            System.out.println("Двигатель запускается.");
        }


    }

    public void showCarBrand () {
        System.out.println(this.brand.toString());
    }
}
