public class Factorial{
    public static void main(String args[]){
        int x= 9;
        int i,fact=1;
        for(i=1;i<=x;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is"+fact);
    }
}