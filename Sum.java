import java.util.*;
public class Sum {
    public static void main(String args[]){
        int a,b;
        System.out.println("Enter the a value:");
        Scanner sc=new Scanner(System.in);
        a =sc.nextInt();
        System.out.println("Enter the b value:");
        b =sc.nextInt();
        int sum =a+b;
        System.out.println("The sum is "+sum);
        sc.close();
    }
}
