
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
    public void run() {
        System.out.println("Iam custom thread:" +Thread.currentThread().getName());
    }

    public static void main(String args[]) throws InterruptedException {
      ExecutorService service = Executors.newCachedThreadPool();

        for(int i = 0; i<10; i++){
            service.execute(new Task());

        }


    }
}
