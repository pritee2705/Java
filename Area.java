import java.util.Scanner;
public class Area {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the height of given right angled triangle:");
     double h=sc.nextDouble();
     System.out.println("Enter the width");
     double w=sc.nextDouble();
     double area= (h* w)*1/2;
     System.out.println("Area is : " +area);
     sc.close();
    }
}
