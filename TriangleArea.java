import java.util.Scanner;
public class TriangleArea {
    public static void main(String args[]){
        float base, height;
        System.out.print("Enter the base value:");
        Scanner sc=new Scanner(System.in);
        base =sc.nextFloat();
        System.out.print("Enter the height of triangle:");
        height =sc.nextFloat();
        float area =(base*height)/2;
        System.out.println(area);
        sc.close();
    }
}
