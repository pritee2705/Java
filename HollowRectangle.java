// program to print hollow rectangle pattern
import java.util.Scanner;
public class HollowRectangle {
    public static void main(String args[]){
        int i,j;
       Scanner sc=new Scanner(System.in);
       System.out.print("n: ");
       int n=sc.nextInt();
       System.out.print("m: ");
       int m=sc.nextInt();
       for(i=1;i<=n;i++){
        for(j=1;j<=m;j++){
            if(i==1||j==1||i==n||j==m){
             System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
       }
       sc.close(); 
    }
}
