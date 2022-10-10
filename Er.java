
class EMP{

    int id;
    String name, address;
    String phone ,type ;
    public EMP(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }


    public void test() {
       switch (type){
           case "HR":
               System.out.println("HR");
               break;
           case "infra":
               System.out.println("infra");
               break;
           case "admin":
               System.out.println("admin");
               break;
           default:System.out.println("Not there");
       }
       }

       }




class HR extends EMP{

    public HR(int i, String n, String a, String p ,String t) {
        super(i, n, a, p,t);

    }


}


public class Er {

    public static void main(String args[]) {

        EMP obj1 = new EMP(1, "rony", "kanthaliya", "8764755660", "HR");
        HR obj2 = new HR(1, "rony", "kanthaliya", "8764755660", "HR");

        obj2.test();
    }
}
