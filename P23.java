public class P23 {
    public static void main(String args[]){
        int n=5;
        for(int i=n-1;i>=0;i--){
           for(int j=0;j<n;j++){
            if(j<i){
                System.out.print("* ");
            }
            else{
                System.out.print((char)(j+65)+" ");
            }
           }
           System.out.print("\n");
        }
    }
}
