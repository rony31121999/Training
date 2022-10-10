package org.example;

import java.util.HashMap;
import java.util.Map;

class WithoutD{
    private int id;
    private String name;
    public WithoutD(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "WithoutD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class EmployeeHashMapWithDuplicate {
    public static void main(String[] args){
        Map<WithoutD, Integer> map = new HashMap<WithoutD, Integer>();

        map.put(new WithoutD(1,"RK"), 11);
        map.put(new WithoutD(2,"DK"), 21);
        map.put(new WithoutD(3,"AW"), 31);
        map.put(new WithoutD(4,"MY"), 44);
        map.put(new WithoutD(5,"WE"), 54);
        map.put(new WithoutD(5,"WE"), 54);


        System.out.println(map);

    }
}

