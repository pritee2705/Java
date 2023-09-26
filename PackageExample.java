import com.example.calculator;  
public class PackageExample {  
    public static void main(String[] args) {  
        calculator calci = new calculator();  
        int result = calci.add(5, 3);  
        System.out.println("Addition: " + result);  
        result = calci.subtract(5, 3);  
        System.out.println("Subtraction: " + result);  
        result = calci.multiply(5, 3);  
        System.out.println("Multiplication: " + result);  
        result = calci.divide(10, 2);  
        System.out.println("Division: " + result);  
    }  
}