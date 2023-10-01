//create a class called Vehicle with a method called drive().
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle{
    void drive(){
        System.out.println("Drive");
    }
}
class Car extends Vehicle{
    @Override
    void drive(){
        System.out.println("Repairing a car");
    }
}
public class W3Q2 {
    public static void main(String[] args) {
        Vehicle V=new Vehicle();
        Car c=new Car();
        V.drive();
        c.drive();
    }
}
