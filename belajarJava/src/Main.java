public class Main {
    public static void main(String[] args) {

        Car electricCar = new ElectricCar("Tesla");

        System.out.println("Driving the electric car: " + electricCar.getCarType() + "\n");

        electricCar.speedUp();
        electricCar.turnLeft();
        electricCar.slowDown();
    }
}
