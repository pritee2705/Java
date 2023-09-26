// Sum of odd numbers from 1 to n

import java.util.Scanner;
public class Q1 {
    public static int calculate(int n){
        int sum=0;
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2 !=0){
                sum =sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        System.out.println("Sum is: "+calculate(n));
      sc.close();  
    }
}
