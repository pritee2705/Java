public class P13 {

    public static void main(String args[]){
        int i,j;
        int n=9;
        for(i=n;i>=1;i--){
            // Spaces
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                if(i%2 !=0){
                System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}