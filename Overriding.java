class Employee{

    int id;
    String name, address;
    String phone;

    public Employee(int i, String n, String a, String p){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    //Overriding without parameters
    public void displayPhone(){
        System.out.println("ID: "+id+"\tPhone: "+phone);
    }

    /*public void displayPhone(String phone){
        System.out.println("\nPhone: "+phone);
    }*/
}

class HR extends Employee{
    int salary;

    public HR(int i, String n, String a, String p, int sal) {
        super(i, n, a, p);
        this.salary = sal;
    }
    //Overriding without parameters
    //@Override
    public void displayPhone(){

        super.displayPhone();
        System.out.println("Name: "+name+"\tPhone: "+phone);
    }
}

class Overriding{

    public static void main(String args[]){

        HR obj2 = new HR(0643,"RONAK","KANTHALIYA", "4848402938", 45000);
        
        //Without parameters 
        obj2.displayPhone();
    }
}
