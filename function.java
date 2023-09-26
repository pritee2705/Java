import java.util.Scanner;
public class function {   
    public static void main(String[] args) {
        //int average;
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        float a=sc.nextFloat();
        System.out.print("b: ");
        float b=sc.nextFloat();
        System.out.print("c: ");
        float c=sc.nextFloat();
        float avg=average(a,b,c);
        System.out.print(avg);  
           sc.close();
    } 
 
    public static float average(float a,float b,float c){
        return (a+b+c)/3;
    }
}

