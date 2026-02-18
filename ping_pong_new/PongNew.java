import java.util.concurrent.Semaphore;

public class PongNew extends Thread{

    Semaphore sem_ping, sem_pong;
    public PongNew(Semaphore sem_ping, Semaphore sem_pong){
        this.sem_ping = sem_ping;
        this.sem_pong = sem_pong;
    }

        public void run()
    {
        while (true) {
            try {
                sem_pong.acquire();
                System.out.println("Pong");
                Thread.sleep(500);
                sem_ping.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}