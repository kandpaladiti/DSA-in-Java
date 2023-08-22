package aditi;

public class employee {
    String firstName;
    String lastName;
    int age;
    double salary;
    String companyName;

    public employee(String f, String l, int a, double s, String cn){
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.salary = s;
        this.companyName = cn;
    }
    public void print(){
        System.out.println("Full Name: "+firstName + " " + lastName);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Company Name: "+companyName);
    }

    public static void main(String[] args) {
        employee e1 = new employee("Aditi", "Kandpal", 30, 50000, "ABC.limited");
        e1.print();
    }
}
