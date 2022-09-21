
class Employee{
    int id;
    String name,address;
    String phone;
    public Employee(int i, String n, String a, String p){
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

public class Empp {
    public static void main(String args[]) {

        Employee obj1 = new Employee(1, "rony", "kanthaliya", "8764755660");
        obj1.display(1);
        obj1.display();
    }
}
