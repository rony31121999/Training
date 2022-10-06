
final public class Immutable1 {
    private final int id;
    private final String name;
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Immutable1(int a,String b){
        this.id=a;
        this.name=b;
    }

    public static void main(String[] args) {
        Immutable1 e1 = new Immutable1(1,"ronak");
        System.out.println(e1.getName());
        e1.getName().concat("kanthaliya");
        System.out.println(e1.getName());
    }
}
