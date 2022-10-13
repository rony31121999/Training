public class Example {


    public synchronized void Odd() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                Thread.sleep(2000);

                System.out.println("odd thread" +i);
                notifyAll();
            }
            else{
                wait();
            }
        }
    }
        public synchronized void even() throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    Thread.sleep(1000);

                    System.out.println("even thread" +i);
                    notifyAll();
                }
                else{
                    wait();
                }
            }
        }




        public static void main (String[] args){
            Example rk = new Example();

            class T1 extends Thread{
                @Override
                public void run() {
                    try {
                        rk.Odd();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
            class T2 extends Thread{
                @Override
                public void run() {
                    try {
                        rk.even();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
T1 t1=new T1();
            t1.setName("odd thread");
            t1.start();
T2 t2=new T2();
t2.setName("even thread");
t2.start();


        }
    }

