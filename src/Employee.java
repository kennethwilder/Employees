/**
 * Created by Thomas on 8/22/2015.
 */
public class Employee {

    private String name;
    private double monthlySalary;

    public Employee() {

    }

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double annualSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    public String toString() {
        return "Employee Name: " + name +
                "\nMonthly Salary: " + monthlySalary;
    }

}
