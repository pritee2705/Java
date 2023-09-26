public class P7 {
    public static void main(String args[]){
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            // Spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
                // Stars
                for(j=1;j<=i;j++){
                    System.out.print("*");
                }
            System.out.print("\n");
        }
    }
}
