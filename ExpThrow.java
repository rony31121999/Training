public class ExpThrow {
    public static void main(String[] args) {
        int age = 23;
        if (age < 18) {
            throw new ArithmeticException("not eligible to vote");
        } else {
            System.out.println("eligible to vote");
        }
    }
}

    class rt extends Exception {
             rt(String str)
             {
                 super(str);

             }
        }

