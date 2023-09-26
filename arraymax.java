
// print the largest element of an array
import java.util.Scanner;

public class arraymax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 5, 9, 7, 1, 33, 79, 25 };
        System.out.print("The array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nThe largest array element is: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[0]);
        sc.close();
    }
}
