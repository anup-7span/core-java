public class Thread1 extends Thread {


    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Thread1 t = new Thread1();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("i->" + i + "\t");
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println("thread1");
            }

        }
        long end = System.currentTimeMillis();

        System.out.println("The total time is "+(end-start)/1000+" Seconds ");
    }

    public void run() {
        for (int j = 0; j <= 10; j++) {
            try {
                System.out.println("j->" + j + "\t");
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}