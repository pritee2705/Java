public class PrimeNumbersInArray {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an array of integers as command line arguments.");
            return;
        }

        int[] numbers = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers.");
            return;
        }

        System.out.println("Prime numbers in the array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
