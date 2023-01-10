public class YieldDemo extends Thread{

    public void run(){
        for (int i=1;i<=10;i++){
            System.out.println("demo1");
            //Thread.yield();
        }
    }
}
