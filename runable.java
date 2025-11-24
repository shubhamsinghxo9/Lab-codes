class runtest implements Runnable{
    public void run(){
        System.out.println("from runnavle");
    }
}
public class runable{
    public static void main(String[] args) {
        runtest t=new runtest();
        Thread th=new Thread(t);
        th.start();
    }
}