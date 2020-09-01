package bankEmployees;

import Pages.AboutPage;
import Pages.LoginPage;
import Pages.Page;

public class Employees {

        private String Name;
        private int id;
        private String title;
        private String dateOfBirth;
        private double salary;
        private String address;


    public Employees(String Name, int id, String title, String dateOfBirth, double salary, String address){
        this.Name = Name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }
    public Employees() {
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void ToString (){
        System.out.println(String.format("Employee name: %s, ID: %d, Title: %s, Date of Birth: %s, Salary: %.2f, Address: %s", Name, id, title, dateOfBirth, salary, address));
    }
    public void ReceiveSalary(){
        System.out.println(String.format("The salary of %s is %.2f", title, salary));
    }

}
