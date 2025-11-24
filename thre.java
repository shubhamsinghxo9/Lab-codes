class mythread extends Thread{
   public void run(){
    System.out.println("thread is runnign");
   }
}
public class thre{
    public static void main(String[] args) {
        mythread t=new mythread();
        t.start();
    }
}