import java.util.Scanner;
public class CircleArea {
    public static void main(String args[]){
      float radius;
      System.out.println("Enter the radius");
      Scanner sc=new Scanner(System.in);
      radius =sc.nextFloat();
      double area = Math.PI*radius*radius;
      System.out.println(area+" is the area");
      sc.close();
    }
}
