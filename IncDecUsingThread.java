
package org.example;

class ronak extends Thread{
    static int count = 0;
    void increment() throws InterruptedException {
        sleep(1000);
        this.count++;
        //this.count = this.count+1;
    }
    void decrement() throws InterruptedException{
        sleep(1000);
        this.count--;
        // this.count = this.count -1;
    }
    public void run(){
        try {
            increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.count+" from inc "+Thread.currentThread().getName());
        try {
            decrement();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.count+" from dec "+Thread.currentThread().getName());
    }
}
public class IncDecUsingThread {
    public static void main(String args[]){
        ronak t1 = new ronak();
        t1.setName("old");
        ronak t2 = new ronak();
        t2.setName("new");

        t1.start();
        t2.start();
        
    }

}
