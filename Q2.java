// find greater number between two no. using function

import java.util.Scanner;
public class Q2 {
    public static int compare(int a,int b){
        int max=a>b?a:b;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Greater number is: "+compare(a,b));
        sc.close();
    }
}
