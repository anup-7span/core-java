package synchonizedBlock;

public class Demo {
    public void hello(String name) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("hello" + " " + name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class MyThread extends Thread {
    Demo dm;
    String name;

    MyThread(Demo dm,String name) {
        this.dm=dm;
        this.name = name;
    }

    public void run() {
        dm.hello(name);
    }
}
class Sync{
    public static void main(String[] args) {
        Demo dm = new Demo();
       MyThread m = new MyThread(dm,"Anup");
       MyThread m1 = new MyThread(dm,"Harsh");

       m.start();
       m1.start();

    }
}

