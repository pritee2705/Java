// Sort the given array
import java.util.Scanner;
public class sortarray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int array[]={5,9,3,7,17,0,9};
       System.out.println("Array elements are: ");
       for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
       }
       System.out.println("\nThe sorted array elements are: ");
       for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]<array[j]){
              int temp=array[i];
              array[i]=array[j];
              array[j]=temp;
            }
        }
       }
       for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
       }
       sc.close();
    }
}
