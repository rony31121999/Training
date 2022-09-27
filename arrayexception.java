public class arrayexception {
    public static void main(String[] args) {
        int i = 0;

        int a[] = new int[5];
        System.out.println("statement1");
        System.out.println("statement2");
        System.out.println("statement3");
        try {
            int data = 100 / i;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("run1");

            try {
                a[10] = 50;
            } catch (IndexOutOfBoundsException q) {

                System.out.println(q);
                System.out.println("run ");

            }

            System.out.println("statement4");
            System.out.println("statement5");

        }
    }
}
