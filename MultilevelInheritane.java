// Continent,Country,State,City,Place

//import java.util.Scanner;

class Continent{
    String name;
    Continent(String name){
        this.name=name;
    }
    void Display(){
        System.out.println("Continent Name: "+name);
    }
}
class Country extends Continent{
    String Cname;
    Country(String name,String Cname){
        super(name);
        this.Cname=Cname;
    }
    void Display1(){
        Display();
        System.out.println("Country name is: "+Cname);
    }
}
class State extends Country{
    String Sname;
    State(String name,String Cname,String Sname){
        super(name,Cname);
        this.Sname=Sname;
    }
    void Display2(){
        Display1();
        System.out.println("State name is: "+Sname);
    }
}

public class MultilevelInheritane {
    public static void main(String args[]){
       State S=new State("Asia", "India", "Maharashtra");
       S.Display2();
       System.out.println("City Name is: Karmala");
    }
}
