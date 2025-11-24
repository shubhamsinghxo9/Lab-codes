class person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;

    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


}
public class encap{
    public static void main(String[] args) {
        person p=new person();
        p.setAge(21);
        p.setName("shubham");
        System.err.println("detail"+p.getName()+"|"+p.getAge());
    }
}