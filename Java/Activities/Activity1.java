package Activities;
public class Activity1 {

    public static void main(String[] args) {
        Car xuv = new Car();
        xuv.make = 2014;
        xuv.color = "Black";
        xuv.transmission = "Manual";

        //Using Car class method
        xuv.displayCharacterstics();
        xuv.accelerate();
        xuv.brake();
    }

}