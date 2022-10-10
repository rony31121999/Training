class Demosem {
    int count = 0;
    public void increment() {
        count++;
        //return count;
    }

    public static void main(String[] args) {
        Demosem obj = new Demosem();
        for(int i = 0; i<100; i++)
        obj.increment(); //call increment
        System.out.println(obj.count);
    }
}
