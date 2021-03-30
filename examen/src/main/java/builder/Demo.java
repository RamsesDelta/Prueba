package builder;

public class Demo {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

    }
}
