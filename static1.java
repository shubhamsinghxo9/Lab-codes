class student{
    String name;
    static String college="IIT";
}
public class static1{
    public static void main(String[] args) {
        student s1=new student();
        s1.name="shubham";
        
        System.out.println(s1.name);
        System.out.println(student.college); 
    }
}