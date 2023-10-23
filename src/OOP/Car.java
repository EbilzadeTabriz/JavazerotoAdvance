package OOP;


public class Car {
    private String color;
    private String name;
    private Float price;
    private int doors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {


            this.price = price;


    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {

        if ( doors<0||doors==0){

            boolean s = false;
            System.out.println("it is invalid feature! please enter again");

        }
       else{
           this.doors = doors;
        }
    }
}