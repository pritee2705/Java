import java.util.Scanner;
public class NumberTable {
    public static void main(String args[]){
        int i,n;
        System.out.println("Enter the number u want to create table of:");
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        for(i=1;i<=10;i++){
          int  ans =n*i;
          System.out.println(ans);
          sc.close();
        }
    }
}
