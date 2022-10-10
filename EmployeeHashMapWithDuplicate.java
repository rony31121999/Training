

import java.util.HashMap;
import java.util.Map;

class WithD{
    private int id;
    private String name;
    public WithD(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "WithD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeHashMapWithDuplicate {
    public static void main(String[] args){
        Map<WithD, Integer> map = new HashMap<WithD, Integer>();

        map.put(new WithD(1,"rk"), 1);
        map.put(new WithD(2,"rf"), 2);
        map.put(new WithD(3,"dr"), 3);
        map.put(new WithD(4,"we"), 4);
        map.put(new WithD(5,"wq"), 5);
        map.put(new WithD(5,"wq"), 5);


        System.out.println(map);

    }
}
