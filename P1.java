public class P1 {
    public static void main(String args[]){
        int i,j;
        int n=5;
        int count=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                count =i*j;
                System.out.print(count+" ");
            }
            System.out.print("\n");
        }
    }
}
