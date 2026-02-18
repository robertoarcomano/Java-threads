public class IdThread extends Thread {
    int num;
    public IdThread(int n) {
        num = n;
    }
    public void run() {
        System.out.println(num);
    }
}

