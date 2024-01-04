import java.util.Scanner;
public class Transpose{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row=sc.nextInt();
        System.out.print("Enter columns: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.print("Enter array Elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display Array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Transpose: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}