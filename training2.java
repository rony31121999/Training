
class E{

    int id;
    String name, address;
    String phone ,type ;
    public E(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }

    public void display(int i){
        System.out.println("Name:"+id+"\nphone:"+phone);
    }

    public void display(){
        System.out.println("\nName:"+name+"\nAddress:"+address);
    }
    public void DM() {
        if (type.equals("HR"))
        {
            System.out.println("HR");
        }
    else if (type.equals("infra"))
        {
            System.out.println("infra");
        }
    else{
            System.out.println("rk");
        }
    }
}





class HR extends E{
    int salary;
    public HR(int i, String n, String a, String p, int sal ,String t) {
        super(i, n, a, p,t);
        this.salary = sal;
    }


}


public class training2 {

    public static void main(String args[]) {

        E obj1 = new E(1, "rony", "kanthaliya", "8764755660", "HR");
        HR obj2 = new HR(1, "rony", "kanthaliya", "8764755660", 40000, "HR");
        obj1.display(1);
        obj1.display();
        obj2.DM();
    }
}
