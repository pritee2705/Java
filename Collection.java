import java.util.*;
import java.io.*;

public class Collection
{
    public static void main(String []args) throws IOException
    {
        int n;
        TreeSet t =new TreeSet<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements: ");
        n=Integer.parseInt(br.readLine());
        Integer[]no=new Integer[n];
        System.out.println("Enter the no:");
        for (int i = 0; i < n; i++) {
            int a;
            a=Integer.parseInt(br.readLine());
            no[i]=new Integer(a);
            t.add(no[i]);
        }
        Iterator itr=t.iterator();
        System.out.println("The Sorted Data: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}