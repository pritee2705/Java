import java.util.Scanner;
public class EvenorOdd1{
    public static void main(String args[]){
        int x;
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        x =sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is even");
        }
        else{
            System.out.println(x+" is odd");
        }
        sc.close();
    }
}
