import java.util.Scanner;
public class StarPattern{
    public static void main(String[] args){
        int i, j, n;
        System.out.println("Enter the number to print pattern:");
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
