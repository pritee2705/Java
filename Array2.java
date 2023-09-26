// Find the max of an array
//import java.util.Scanner;
public class Array2 {
    public static void main(String args[]) {
        int i, j;
        int array[] = { 2, 3, 5, 9, 33 };
        for(i=0;i<5;i++){
            System.out.print(" "+ array[i]+" ");
        }
        for ( i = 0; i < array.length; i++) {
           for ( j = i+1; j < array.length; j++){
            if (array[i]<array[j]) {
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
           } 
        }
        System.out.print("\n");
        System.out.println("Max element of an array is: "+array[0]);
    }
}
