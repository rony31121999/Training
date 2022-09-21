class EMP{

    int id;
    String name, address;
    String phone;
    public EMP(int i, String n, String a, String p){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    public void display(int i){
        System.out.println("Name:"+id+"\nphone:"+phone);
    }

    public void display(){
        System.out.println("\nName:"+name+"\nAddress:"+address);
    }
}

class HR extends EMP{
    int salary;
    public HR(int i, String n, String a, String p, int sal) {
        super(i, n, a, p);
        this.salary = sal;
    }

    public void empWithSalary(){
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+salary);
    }

    public void empWithSalary(int tax){
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+(salary-tax)+"\nTax Deducted: "+tax);
    }
}

public class Overloading1 {

    public static void main(String args[]) {

        EMP obj1 = new EMP(1, "rony", "kanthaliya", "8764755660");
        HR obj2 = new HR(1, "rony", "kanthaliya", "8764755660", 40000);
        obj1.display(1);
        obj1.display();
        obj2.empWithSalary();
        obj2.empWithSalary(5000);
    }
}
