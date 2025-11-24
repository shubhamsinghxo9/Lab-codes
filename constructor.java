class student{
    String name;
    int age;
    student(String n,int a){
        name=n;
        age=a;
    }
    void class1(){
        System.out.println(name+age);
    }

}
public class constructor{
    public static void main(String[] args) {
        student student=new student("shubham",9);
        student.class1();
        
    }
}