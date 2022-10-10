class Session extends Thread {
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(i +Thread.currentThread().getName());
        }
        System.out.println("Iam custom thread:" +Thread.currentThread().getName());
    }

    public static void main(String args[]) throws InterruptedException {
        session t1 = new session();
        System.out.println("I am main thread:"+Thread.currentThread().getName());
        t1.setName("sum");
        t1.start();
       t1.join();
        for(int i = 0; i<10; i++){
            System.out.println(i +Thread.currentThread().getName());
        }
    }
}

