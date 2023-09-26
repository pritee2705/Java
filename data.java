class student{
    int roll_no;
    String name;
    student(){
        roll_no=11;
        name="Pritee";
    }
    void display(){
        System.out.println(roll_no+" "+name);
    }
}
public class data {
    public static void main(String[] args) {
        student s1=new student();
        s1.display();
    }
}
