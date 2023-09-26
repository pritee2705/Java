import java.util.*;
public class name {
    public static void myname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
     // name a=new name();
      myname(a);
      sc.close();
    }
}
