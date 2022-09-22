import java.util.*;

class Employeetest{
        int id;
        String address ;

        Employeetest(int i, String a) {
            this.id = i;
            this.address = a;
        }

        public void displaydetails(){

        }
}

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");*/
        Employeetest e1 = new Employeetest(10, "ABC");
        Employeetest e2 = new Employeetest(23, "ABC2");
        Employeetest e3 = new Employeetest(144, "AB3C");
        Employeetest e4 = new Employeetest(1055, "ABC55");
        Employeetest e5 = new Employeetest(15, "AB66C");
        Employeetest e6 = new Employeetest(16, "ABC7");
        Employeetest e7 = new Employeetest(13, "AB88C");
        Employeetest e8 = new Employeetest(111, "ABC");
        Employeetest e9 = new Employeetest(114, "AB453C");
        Employeetest e10 = new Employeetest(161, "ABC345");

        ArrayList<Employeetest> empArr = new ArrayList<>();

        empArr.add(e1);
        empArr.add(e2);
        empArr.add(e3);
        empArr.add(e4);
        empArr.add(e5);
        empArr.add(e6);
        empArr.add(e7);
        empArr.add(e8);
        empArr.add(e9);
        empArr.add(e10);


        for (Employeetest emp : empArr) {
                if (emp.id % 2 != 0)
                    continue;
                emp.displaydetails();
                System.out.println(emp.id + " " + emp.address);
            }
    }
}
