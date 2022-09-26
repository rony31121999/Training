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
        Immutable1 i=new Immutable1(11,"abc");
        System.out.println(i.name);
    }
}
