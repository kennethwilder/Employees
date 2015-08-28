/**
 * Created by Thomas on 8/22/2015.
 */
public class Employee {

    private String name;
    private double monthlySalary;
    private int year;

    /*
            Constructors
     */

    public Employee() {

    }

    public Employee(int year, String name, double monthlySalary) {
        this.year = year;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    /*
            Functions
     */

    public double annualSalary() {
        return this.monthlySalary * 12;
    }

    public String toString() {
        return "Employee Name: " + name +
                "\nMonthly Salary: " + monthlySalary;
    }

    /*
            Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
