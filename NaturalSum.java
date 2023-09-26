// sum of first n natural numbers
import java.util.Scanner;
public class NaturalSum {
     public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to print sum upto:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum =sum +i;
        }
        System.out.print(sum);
        sc.close();
    }
    
}
