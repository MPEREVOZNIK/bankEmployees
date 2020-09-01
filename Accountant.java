package bankEmployees;

public class Accountant extends Employees{
    String title = "Accountant";
    double salary = 5000;

public Accountant (String Name, int id, String title, String dateOfBirth, double salary, String address) {
    super(Name, id, title, dateOfBirth, salary, address);
}

    public void openNewAccount(){
        System.out.println(String.format("The %s opens new accounts.", title));
    }
    public void closeAccount (){
        System.out.println(String.format("The %s closes accounts.", title));
    }
    public void createReports (){
        System.out.println((String.format("The %s creates new reports.", title)));
    }

}
