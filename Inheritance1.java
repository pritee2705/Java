

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.eat();
        D.bark();
    }
}
