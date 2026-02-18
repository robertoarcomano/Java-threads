public class MyThread {
    public static void main(String args[]) {
        IdThread idT1, idT2, idT3;
        idT1 = new IdThread(1); 
        idT3 = new IdThread(3); 
        idT2 = new IdThread(2); 
        
        idT1.start();
        idT3.start();
        idT2.start();
    }
}