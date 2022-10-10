
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
    public void run() {
        System.out.println("Iam custom thread:" +Thread.currentThread().getName());
    }

    public static void main(String args[]) throws InterruptedException {
       ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for(int i = 0; i<10; i++){
            service.execute(new Task1());
           Task1 t1 = new Task1();
            t1.start();
        }


    }
}
