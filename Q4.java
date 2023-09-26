//takes age as input and returns voting eligibility using function
import java.util.Scanner;
public class Q4 {
    public static void Person(int age){
        if(age>18){
            System.out.println("Eligible to vote.");
        }
        else{
            System.out.println("Not eligible.");
        }
       // return  age;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int age=sc.nextInt();
        Person(age);
        sc.close();
    }
}
