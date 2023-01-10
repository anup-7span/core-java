package classLavelLock;

public class Demo {
    public synchronized static void hello(String name) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello"  + " " +name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        Demo.hello(name);
    }
}
class Sync{
    public static void main(String[] args) {
       MyThread m = new MyThread("Anup");
       MyThread m1 = new MyThread("Harsh");

       m.start();
       m1.start();

    }
}

