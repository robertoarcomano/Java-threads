import java.util.concurrent.Semaphore;

public class Ping extends Thread{
    Semaphore sem;
    public Ping(Semaphore sem){
        this.sem=sem;
    }

        public void run()
    {
        
        while (true) {
            try {
                sem.acquire();
                System.out.println("Ping");
                Thread.sleep(1000);
                sem.release();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
