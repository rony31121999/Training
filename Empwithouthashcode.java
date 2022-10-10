import java.util.HashMap;
import java.util.Map;
import java.util.*;
class Empwithouthashcode {
    int id;
    String name;


    public Empwithouthashcode(int i, String n) {
        this.id = i;
        this.name = n;

    }
    @Override
    public String toString() {
        return "Empwithouthashcode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public int hashCode(){
        int hashCode =0;
        return hashCode;
    }
    public boolean equals(Object rk){
        if(rk instanceof Empwithouthashcode){
            Empwithouthashcode emp =(Empwithouthashcode) rk;
            return(emp.name.equals(this.name) && emp.id ==this.id);
        }else{
            return false;
        }
    }

}
class entry12 {
    public static void main(String args[]) {
        Empwithouthashcode we = new Empwithouthashcode(1, "dhiru");
        Empwithouthashcode re = new Empwithouthashcode(23, "roank");
        Empwithouthashcode te = new Empwithouthashcode(112, "praj");
        Empwithouthashcode ye = new Empwithouthashcode(938, "div");
        Empwithouthashcode xe = new Empwithouthashcode(12, "red");
        HashMap<Integer, Empwithouthashcode> empmap = new HashMap();
        empmap.put(1, we);
        empmap.put(23, re);
        empmap.put(112, te);
        empmap.put(938, ye);
        empmap.put(12, xe);
        System.out.println(empmap);
    }
}

