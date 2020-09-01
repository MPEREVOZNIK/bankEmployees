package bankEmployees;

public class Manager extends Employees{
    String title = "Manager";
    double salary = 10000;

    public Manager (String Name, int id, String title, String dateOfBirth, double salary, String address) {
        super(Name, id, title, dateOfBirth, salary, address);
    }

    public void  HireEmployees(){
        System.out.println(String.format("The manager hired employee"));
    }
    public void  FireEmployees(){
        System.out.println(String.format("The manager fired employee"));
    }

}
