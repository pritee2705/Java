// create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark. 

class Animal{
    void makeSound(){
        System.out.println("The animal makes sound.");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat quarrels.");
    }
}
public class W3Q1 {
    public static void main(String args[]){
        Animal sound=new Animal();
        Cat sound1=new Cat();
        sound.makeSound();
        sound1.makeSound();
    }
}
