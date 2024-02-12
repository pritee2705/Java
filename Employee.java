import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Employee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer, String> employeeHashtable = new Hashtable<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee ID: ");
            int id = scanner.nextInt();
            System.out.print("Enter employee name: ");
            String name = scanner.next();

            employeeHashtable.put(id, name);
        }

        System.out.println("\nEmployee Details:");

        Set<Integer> keys = employeeHashtable.keySet();
        for (int key : keys) {
            System.out.println("ID: " + key + ", Name: " + employeeHashtable.get(key));
        }

        scanner.close();
    }
}