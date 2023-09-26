// Find circumference by taking radius from user using function
import java.util.Scanner;
public class Q3 {
    public static double calculate(double r){
       double circumference=2*Math.PI*r;
       return circumference;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r=sc.nextDouble();
        System.out.print("Circumference is: "+calculate(r));
        sc.close();
    }
}
