package bankEmployees;

public class Clerk extends Employees{
    String title = "Clerk";
    double salary = 3000;


    public Clerk (String Name, int id, String title, String dateOfBirth, double salary, String address) {
        super(Name, id, title, dateOfBirth, salary, address);
    }

    public void CallCustomer(){
        System.out.println(String.format("The %s calls the customers.", title));
    }
    public void ReceiveCalls (){
        System.out.println(String.format("The %s receives calls.", title));
    }
}
