public class Exceptiontest {
    public static void main(String[] args) {
        int i =1;
       // String s=null;
        System.out.println("statement1");
        System.out.println("statement2");
        System.out.println("statement3");
        try{
            int data=100/i;
            //s.length();
        } catch(Exception e)
        {
              System.out.println(e);
            System.out.println("run");
        }
        finally{
            System.out.println("finally");
         
        
        }
        System.out.println("statement4");
        System.out.println("statement5");

    }
}

