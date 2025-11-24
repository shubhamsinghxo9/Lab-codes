class firstt extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hii from show ");
        }
    }
}
class second1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hii from show  second");
        }
    }
}
public class testsleep{
    public static void main(String[] args) {
        firstt t=new firstt();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
        }
        second1 r=new second1();
        r.start();
    }
}