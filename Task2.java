
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task2 extends Thread {
    public void run() {
        System.out.println("Iam custom thread:" +Thread.currentThread().getName());
    }

    public static void main(String args[]) throws InterruptedException {
     ExecutorService service = Executors.newSingleThreadExecutor();

        for(int i = 0; i<10; i++){
            service.execute(new Task2());
           Task2 t1 = new Task2();
            t1.start();
        }


    }
}
