//half inverted pyramid
public class HalfInvertP {
    public static void main(String args[]){
        int i,j;
        int n=4;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
