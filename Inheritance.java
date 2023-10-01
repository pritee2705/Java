// Arithmetic operations using inheritane

import java.util.Scanner;

class A{
    int z;
    void add(int x,int y){
        z=x+y;
        System.out.print("Addition is: "+z);
    }
    void subtract(int x,int y){
        z=x-y;
        System.out.print("\nsubtraction is: "+z);
    }
}
class B extends A {
    void multiply(int x,int y){
    z=x*y;
    System.out.print("\nMultiplication is: "+z);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x: ");
        int x= sc.nextInt();
        System.out.print("Enter y: ");
        int y= sc.nextInt();
        B demo=new B();
        demo.add(x,y);
        demo.subtract(x,y);
        demo.multiply(x,y);
        sc.close();
    }
}
