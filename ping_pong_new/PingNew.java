import java.util.concurrent.Semaphore;

public class PingNew extends Thread{
    Semaphore sem_ping, sem_pong;
    public PingNew(Semaphore sem_ping, Semaphore sem_pong){
        this.sem_ping = sem_ping;
        this.sem_pong = sem_pong;
    }

        public void run()
    {
        
        while (true) {
            try {
                sem_ping.acquire();
                System.out.println("Ping");
                Thread.sleep(250);
                sem_pong.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
