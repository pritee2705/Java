class rectangle{
    int length;
    int breadth;
    rectangle(int l,int b){
        length =l;
        breadth =b;
    }
    int area(){
        int r_area=length*breadth;
        return r_area;
    }
}
public class pconstructor {
    public static void main(String[] args) {
        rectangle a=new rectangle(5, 3);
        //a.area();
        System.out.println("Area is: "+a.area());
    }
}
