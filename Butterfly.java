public class Butterfly {
    public static void main(String args[]){
        int i,j,k;
        int n=5;
        //Upper half
        for(i=1;i<=n;i++){
            // 1st part
           for(j=1;j<=i;j++){
            System.out.print("*");
           }
           //Spaces
            for(k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
           // 2nd part
           for(j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println("\n");
        }
        //Lower half
        for(i=n;i>=1;i--){
            // 1st part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            // For spaces
            for(k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // 2nd part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
