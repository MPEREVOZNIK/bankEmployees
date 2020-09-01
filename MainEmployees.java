package bankEmployees;

public class MainEmployees {
    public static void main(String[] args) {
        Manager manager = new Manager("Megan White", 1, "Manager", "01.01.1980", 10000, "Toronto");
        manager.ToString();
        manager.ReceiveSalary();
        manager.FireEmployees();
        manager.HireEmployees();

        Accountant accountant1 = new Accountant("Joe Smith", 2, "Accountant", "02.02.1985", 5000, "London");
        Accountant accountant2 = new Accountant("Kate Lee", 22, "Accountant", "12.05.1984", 5000, "Oakville");
        Accountant accountant3 = new Accountant("Bob Black", 82, "Accountant", "13.08.1984", 5000, "Kingston");
        accountant1.ReceiveSalary();
        accountant1.ToString();
        accountant1.openNewAccount();
        accountant1.closeAccount();
        accountant1.createReports();
        accountant2.ReceiveSalary();
        accountant2.ToString();
        accountant2.openNewAccount();
        accountant2.closeAccount();
        accountant2.createReports();
        accountant3.ReceiveSalary();
        accountant3.ToString();
        accountant3.openNewAccount();
        accountant3.closeAccount();
        accountant3.createReports();

        Clerk clerk1 = new Clerk("Alison Wilson", 3, "Clerk", "01.02.1964", 3000, "Ottawa");
        Clerk clerk2 = new Clerk("Anne Clinton", 55, "Clerk", "24.06.1957", 3000, "Hamilton");
        Clerk clerk3 = new Clerk("Jim Brown", 45, "Clerk", "30.05.1988", 3000, "Carp");
        clerk1.ReceiveSalary();
        clerk1.ToString();
        clerk1.CallCustomer();
        clerk1.ReceiveCalls();
        clerk2.ReceiveSalary();
        clerk2.ToString();
        clerk2.CallCustomer();
        clerk2.ReceiveCalls();
        clerk3.ReceiveSalary();
        clerk3.ToString();
        clerk3.CallCustomer();
        clerk3.ReceiveCalls();

    }
}
