import java.util.HashMap;
import java.util.Map;

class employee {
    int id;
    String name;


    public employee(int i, String n) {
        this.id = i;
        this.name = n;

    }

}
        class entry1 {
            public static void main(String args[]) {
                employee q = new employee(1, "dhiru");
                employee w = new employee(23, "roank");
                employee e = new employee(112, "praj");
                employee r = new employee(938, "div");
                employee t = new employee(12, "red");
                HashMap<Integer, employee> empmap = new HashMap();
                empmap.put(1, q);
                empmap.put(23, w);
                empmap.put(112, e);
                empmap.put(938, r);
                empmap.put(12, t);
                System.out.println(empmap);
            }
        }


