public class NumberPyramid {
    public static void main(String args[]){
        int n=5;
        int i,j;
        for(i=1;i<=n;i++){
            // Spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // Numbers
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}
