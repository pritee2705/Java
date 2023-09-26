class square{
    int side;
    int sum(int side){
        int area= side*side;
        return area;
    }
}
public class area2 {
    public static void main(String[] args) {
        square s=new square();
        System.out.println("Area is: "+s.sum(5));
    }
}
