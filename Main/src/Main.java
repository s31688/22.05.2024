import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Car car = new Car("Buick", "En-vista", 2024, 14, 45);
        System.out.println(car.calculateFuelEfficiency());
        Truck truck = new Truck("Man", "A364", 2005, 800, 78, 123);
        System.out.println(truck.calculateFuelEfficiency());
        Car car2 = new Car("Tesla", "X", 2024, 14, 45);
        System.out.println(car2.calculateFuelEfficiency());
        System.out.println(vehicles);
    }
}