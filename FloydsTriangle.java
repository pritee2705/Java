public class FloydsTriangle{
    public static void main(String args[]){
        int n=5;
        int i,j;
        int count=0;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.print("\n");
        }
    }
}