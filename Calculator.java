import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        System.out.println("Enter the a value:");
        Scanner sc = new Scanner (System.in );
        double a=sc.nextDouble ();
        System.out.println ("Enter b Value : ");
        double b=sc.nextDouble();
        System.out.println("Enter choice:");
        int choice=sc.nextInt();
        switch(choice) {
            case 1: double add=a+b;
                    System.out.println(add);
                    break; 
            case 2:double subtraction=a-b;
                   System.out.println(subtraction);  
                   break;
            case 3:double mult=a*b;
                   System.out.println(mult);
                   break;
            case 4:double division=a/b;
                   System.out.println(division);
                   break;
            case 5:double modulo=a%b;
                    System.out.println(modulo);
                    break; 
            default:System.out.println("Invalid Choice");               
        }
        sc.close();
    }
}
