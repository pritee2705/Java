public class Diamond {
    public static void main(String args[]){
        int i,j;
        int n=4;
        // Upper half
        for(i=1;i<=n;i++){
            // Spaces 
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Stars - 1st half
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            // 2nd half
            for(j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // Lower Half
       // System.out.print(" ");
        for(i=n;i>=1;i--){
            // Spaces
            System.out.print(" ");
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // 1st half
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            // 2nd Half
            for(j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
