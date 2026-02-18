import java.util.concurrent.Semaphore;

public class Studenti extends Thread{
    Semaphore semStudenti;
    private int nStud;
        public Studenti(Semaphore semStudenti, int nStud){
            this.semStudenti = semStudenti;
            this.nStud = nStud;
        }
        public void run()
    {
        try{
            this.semStudenti.acquire();
            System.out.println("Lo studente n: " + this.nStud + "sta usando il laboratorio");
            Thread.sleep(Math.round(Math.random()*3000 + 2000));
            System.out.println("Lo studente n: " + this.nStud + "lasciando il laboratorio");
            this.semStudenti.release();
        }catch(Exception e){

        }
        
    }
}
