// Butterfly Pattern
public class Rhombus {
    public static void main(String args[]){
        int n=5;
        int i,j,k;
        // Upper half
        for(i=1;i<=n;i++){
            // 1st part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
            for(k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            // 2nd part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.print("\n");
        }
        // Lower Half
         for(i=n;i>=1;i--){
            // 1st part
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces
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
