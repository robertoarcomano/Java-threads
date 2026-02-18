import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LaboratorioNew {
    public static void main(String[] var0) {
        ArrayList<StudentiNew> allievi = new ArrayList<>();
        BlockingQueue<Integer> codaStudenti = new LinkedBlockingQueue<>();        // Semaphore semStudenti = new Semaphore(8);

        for (int i = 0; i < 8; i++)
            codaStudenti.add(i);

        for (int i = 0; i < 13; i++) {
            allievi.add(new StudentiNew(i, codaStudenti));
            allievi.get(i).start();
        }
    }
}

