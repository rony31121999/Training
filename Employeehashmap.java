import java.util.HashMap;
import java.util.Map;

class Employeehashmap {
    int id;
    String name;


    public Employeehashmap(int i, String n) {
        this.id = i;
        this.name = n;

    }

}
class Employeehashmap1 {
    public static void main(String args[]) {
        Employeehashmap q = new Employeehashmap(1, "dhiru");
        Employeehashmap w = new Employeehashmap(23, "roank");
        Employeehashmap e = new Employeehashmap(112, "praj");
        Employeehashmap r = new Employeehashmap(938, "div");
        Employeehashmap t = new Employeehashmap(12, "red");
        HashMap<Integer, Employeehashmap> empmap = new HashMap();
        empmap.put(1, q);
        empmap.put(23, w);
        empmap.put(112, e);
        empmap.put(938, r);
        empmap.put(12, t);
        System.out.println(empmap);
    }
}


