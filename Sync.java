public class Sync {
    int count = 0;

    public synchronized int increment() {
        System.out.println("I am not sync"+ Thread.currentThread().getName());
        synchronized (this){
            count++;
        }

        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        Sync obj = new Sync();
        class T1 extends Thread {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    obj.increment();
                    //System.out.println(i + Thread.currentThread().getName());
                }
                //System.out.println(obj.increment());
                // super.run();
            }
        }
        class T2 extends Thread {

            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    obj.increment();
                    //System.out.println(i + Thread.currentThread().getName());
                }
                // System.out.println(obj.increment());
                super.run();
            }
        }

        T1 t=new T1();

        T2 t2=new T2();
        t2.start();
        t.start();

        Thread.sleep(1000);
        System.out.println(obj.count);
    }
}
