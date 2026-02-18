import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class StudentiNew extends Thread {
    BlockingQueue<Integer> codaStudenti = new LinkedBlockingQueue<>();
    private int nStud;

    public StudentiNew(int nStud, BlockingQueue<Integer> codaStudenti) {
        this.nStud = nStud;
        this.codaStudenti = codaStudenti;
    }

    public void run() {
        try {
            int pc = this.codaStudenti.take();
            System.out.println("Lo studente n: " + this.nStud + " sta usando il computer n: " + pc);
            Thread.sleep(Math.round(Math.random() * 3000 + 2000));
            System.out.println("Lo studente n: " + this.nStud + " rilascia il pc n: " + pc);
            this.codaStudenti.add(pc);
        } catch (Exception e) {

        }
    }
}
