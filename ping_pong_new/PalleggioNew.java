import java.util.concurrent.Semaphore;

public class PalleggioNew {
    public static void main(String args[]) {
        Semaphore sem_ping = new Semaphore(1);
        Semaphore sem_pong = new Semaphore(1);

        PingNew ping = new PingNew(sem_ping, sem_pong);
        PongNew pong = new PongNew(sem_ping, sem_pong);

        // Situazione iniziale
        try {
            sem_pong.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ping.start();
        pong.start();
    }
}
