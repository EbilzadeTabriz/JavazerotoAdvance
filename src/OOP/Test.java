package OOP;

public class Test {
    public static void main(String[] args) {

        Car car = new Car();
        car.setName("BMW");
        car.setColor("Black");
        car.setDoors(0);
        car.setPrice(200000f);

        System.out.println( car.getDoors()+" is entered number.");


    }
}
