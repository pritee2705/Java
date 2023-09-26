import java.util.Scanner;
public class multiply {
    public static int calculate(int a,int b){
        int product =a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Product is: "+calculate(a, b));
        sc.close();
    }
}
