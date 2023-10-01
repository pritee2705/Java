//Create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

import java.util.Scanner;
class Shape{
    int area;
    int getArea(int length,int breadth){
        area = length*breadth;
        System.out.println("Area is: "+area);
        return area;
    }
}
class Rectangle extends Shape{
    @Override
    int getArea(int length,int breadth){
        area = length*breadth;
        System.out.println("Area is: "+area);
        return area;
    }
} 
public class W3Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth=sc.nextInt();
        Rectangle R=new Rectangle();
        R.getArea(length, breadth);
        sc.close();
    }
}
