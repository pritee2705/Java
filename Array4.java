// Even and Odd Numbers of array
public class Array4 {
    public static void main(String args[]) {
        int array[] = { 32, 75, 79, 31, 88, 47, 98 };
        System.out.println("Even elements are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }
        }
        System.out.println("Odd Elements are:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
