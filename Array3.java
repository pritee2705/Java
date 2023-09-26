// 2D Array
public class Array3 {
    public static void main(String args[]){
       int [][] array={{2,3,5},{7,9,3},{8,1,4}};
       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println("arr["+i+"]["+j+"] ="+array[i][j]);
        }
       }
       System.out.println("array elements:");
       for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(" "+array[i][j]);
        }
        System.out.print("\n");
       }
    }
}
