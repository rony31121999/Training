import java.util.HashMap;
import java.util.Map;
import java.util.*;
class empwithouthashcode {
    int id;
    String name;


    public empwithouthashcode(int i, String n) {
        this.id = i;
        this.name = n;

    }
    @Override
    public String toString() {
        return "empwithouthashcode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public int hashCode(){
        int hashCode =0;
        return hashCode;
    }
    public boolean equals(Object rk){
        if(rk instanceof empwithouthashcode){
            empwithouthashcode emp =(empwithouthashcode) rk;
            return(emp.name.equals(this.name) && emp.id ==this.id);
        }else{
            return false;
        }
    }

}
class entry12 {
    public static void main(String args[]) {
        empwithouthashcode we = new empwithouthashcode(1, "dhiru");
        empwithouthashcode re = new empwithouthashcode(23, "roank");
        empwithouthashcode te = new empwithouthashcode(112, "praj");
        empwithouthashcode ye = new empwithouthashcode(938, "div");
        empwithouthashcode xe = new empwithouthashcode(12, "red");
        HashMap<Integer, empwithouthashcode> empmap = new HashMap();
        empmap.put(1, we);
        empmap.put(23, re);
        empmap.put(112, te);
        empmap.put(938, ye);
        empmap.put(12, xe);
        System.out.println(empmap);
    }
}

