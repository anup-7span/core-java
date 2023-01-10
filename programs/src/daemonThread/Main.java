package daemonThread;

class Demo extends Thread {
    public void run(){
        for (int i =0;i<=10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        Demo d = new Demo();
        d.start();

    }
}
