// addition and Multiplication of matrix

import java.util.Scanner;

class MatrixOperation {
    public static void main(String args[]){
        int i=3;
        int j=3;
        Scanner sc=new Scanner(System.in);
        int a[i][j]={{3,2,5},{4,9,7},{6,1,8}};
        int b[i][j]={{0,2,1},{1,5,3},{4,8,6}};
        System.out.println("Enter choice to perform operations: "+"\n1.Addition\n2.Multiplication\n3.Exit");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
             int addition(int a,int b){
             int  Add[i][j]=a[i][j]+b[i][j];
             return Add;
            }
                break;
        
            case 2:
            int Multiplication(int a,int b){
                int mult[i][j]=a[i][j]*b[i][j];
                return mult;
            }
                break;
        }
    }
}