public class Palindrome {
    public static void main(String args[]){
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            // Spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Numbers
            for(j=i;j>=1;j--){
                System.out.print(j);
            }
            // 2nd half
            for(j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
