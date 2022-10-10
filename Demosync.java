public class Demosync {
    int count = 0;
    public int increment() {
        count++;
        return count;
    }

    public static void main(String[] args) {

        Demosync obj = new Demosync();
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
        t.start();
        T2 t2=new T2();
        t2.start();
        System.out.println(obj.count);
    }
}


