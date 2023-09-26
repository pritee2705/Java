// 1-D Array - Array creation and Traversal
import java.util.Scanner;
public class Array1{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size of array:");
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
         System.out.println("Enter array elements: ");
         arr[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("Enter index u want to search element: ");
      int index=sc.nextInt();
      System.out.println("The number at index "+index+ " is "+arr[index]);
      sc.close();
    }
}