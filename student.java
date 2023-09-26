// Create student class using buffered reader
import java.io.*;
import java.io.BufferedReader;
// import java.util.*;
public class student {
    int roll_no;
    String name;
    String Class;
    Float percentage;
      student(int roll_no,String name,String Class,Float percentage ){
        this.roll_no=roll_no;
        this.name=name;
        this.Class=Class;
        this.percentage =percentage;

    }
    public void Display(){
        System.out.println("Student Info : "+roll_no+" "+name+" "+Class+" "+percentage);
        return;
    }
    public static void main(String[] args) 
     {
        try {
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            int roll_no=Integer.parseInt(br.readLine());
            String name=br.readLine();
            String Class=br.readLine();
            float percentage=Float.parseFloat(br.readLine());
            student Student=new student( roll_no,name, Class, percentage);
            Student.Display();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
