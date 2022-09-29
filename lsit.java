import java.util.*;

public class lsit {
    public static void main(String[] args) {
        LinkedList<Integer> node=new LinkedList<>();
        LinkedList<Integer> node1=new LinkedList<>();
        node.add(1);
        node.add(3);
        node.add(23);
        node1.add(65);
        node1.add(651);
        node1.add(6512);
        node1.add(6523);
        node.addAll(node1);
       
        node.remove(2);
        //node.removeAll(node);
        //node1.removeAll(node1);

        System.out.println(node);

    }
}
