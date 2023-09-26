import java.util.*;
public class EGL {
    public static void main(String args[]){
    System.out.println("Enter the numbers:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b){
        System.out.println("Equal");
    }
    else{
        if(a>b){
            System.out.println(a+" is Greater");
        }
        else{
            System.out.println(a+"  is Less");
        }
       // System.out.println("Not Equal");
    }
    sc.close();
    }
}
