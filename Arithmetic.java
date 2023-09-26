import java.util.Scanner;
public class Arithmetic {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a value:");
       int a =sc.nextInt();
       System.out.println("Enter b value:");
       int b =sc.nextInt();
       System.out.println("a+b ="+(a+b));
       System.out.println("a-b ="+(a-b));
       System.out.println("a*b ="+(a*b));
       System.out.println("a/b ="+(a/b));
       System.out.println("a%b ="+(a%b));
       System.out.println("a++ ="+(a++));
       System.out.println("a-- ="+(a--));
       System.out.println("++a ="+(++a));
       sc.close();
    }
}
