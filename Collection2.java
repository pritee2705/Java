import java.util.*;
import java.util.LinkedList;


public class Collection2 {
    public static void main(String []args)
    {
        LinkedList L=new LinkedList<>();
        L.add("Red");
        L.add("Blue");
        L.add("Yellow");
        L.add("Orange");

        Iterator itr=L.iterator();
        System.out.println("Elements are: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator Litr=L.listIterator();
        while (Litr.hasNext()) {
            Litr.next();
        }
        System.out.println("Elements in Reverse Order are: ");
        while (Litr.hasPrevious()) {
            System.out.println(Litr.previous());
        }

        LinkedList L2=new LinkedList<>();
        L2.add("Pink");
        L2.add("Green");
        itr=L2.iterator();
        L.add(2,itr.next());
        L.add(3,itr.next());

        Iterator i2=L.iterator();
        System.out.println("The total elements are: ");
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
    }
}
