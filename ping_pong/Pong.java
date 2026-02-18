import java.util.concurrent.Semaphore;

public class Pong extends Thread{

    Semaphore sem;
    public Pong(Semaphore sem){
        this.sem=sem;
    }

        public void run()
    {
        while (true) {
            try {
                sem.acquire();
                Thread.sleep(1000);
                System.out.println("Pong");
                sem.release();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}