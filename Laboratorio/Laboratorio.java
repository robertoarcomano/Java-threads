import java.util.ArrayList;
import java.util.concurrent.Semaphore;


public class Laboratorio{
    public static void main(String[] var0){
        ArrayList <Studenti> allievi = new ArrayList<>();
        Semaphore semStudenti = new Semaphore(8);
        for(int i = 0; i < 13; i++){
            allievi.add(new Studenti(semStudenti, i));
            allievi.get(i).start();
        }

    }
}
