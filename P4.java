public class P4 {
    public static void main(String args[]){
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            int x=i;
            for(j=1;j<=n;j++){
              System.out.print(x+" ");
              x +=n;
            }
            System.out.print("\n");
        }
    }
}
