public class Prime{
     public static void main(String args[]){
        int n=23;
        int i;
        int count = 0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
    }
}
