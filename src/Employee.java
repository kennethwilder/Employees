import java.text.DecimalFormat;

/**
 * Created by Thomas Hodges on 8/22/2015.
 *
 * Filename: Employee.java
 *
 * Course: CMIS 242 - Intermediate Programming
 * Professor: Ioan Salomie
 * Assignment: Project 1
 *
 * Platform: Windows 10, IntelliJ IDEA 14.1.4
 * Compiler: jdk1.8.0_45
 */
public class Employee {

    private String name;
    private double monthlySalary;
    private int year;
    protected static DecimalFormat df = new DecimalFormat("$0.00");

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

    /*
    For the Employee class, annualSalary only needs to return the monthlySalaray * 12
     */
    public double annualSalary() {
        return this.monthlySalary * 12;
    }

    public String toString() {
        return "\nEmployee Name: \t\t\t" + this.name +
                "\nAnnual Salary: \t\t\t" + df.format(this.annualSalary());
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
