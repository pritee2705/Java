class rectangle{
    int length;
    int breadth;
    rectangle(){
        length =9;
        breadth =5;
    }
    int area(){
        int rect_area = length *breadth;
        return rect_area;
    }
}
public class constructor {
    public static void main(String[] args) {
        rectangle a=new rectangle();
        System.out.println("Area of rectangle is: "+a.area());
    }
}
