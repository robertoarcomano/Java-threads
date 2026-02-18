import java.util.concurrent.Semaphore;

public class Palleggio {
    public static void main(String args[]) {
        Semaphore sem = new Semaphore(1);

        Ping ping = new Ping(sem);
        Pong pong = new Pong(sem);

        ping.start();
        pong.start();
    }
}