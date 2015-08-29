/**
 * Created by Thomas Hodges on 8/22/2015.
 *
 * Filename: Salesman.java
 *
 * Course: CMIS 242 - Intermediate Programming
 * Professor: Ioan Salomie
 * Assignment: Project 1
 *
 * Platform: Windows 10, IntelliJ IDEA 14.1.4
 * Compiler: jdk1.8.0_45
 */
public class Salesman extends Employee {

    private double annualSales;

    /*
            Constructors
     */

    public Salesman() {

    }

    public Salesman(int year, String name, double monthlySalary, double annualSales) {
        super(year, name, monthlySalary);
        this.annualSales = annualSales;
    }

    /*
            Functions
     */

    /*
    In addition to the Employee's annualSalary, the Salesman's annualSalary method must
    take into account its commission. Before the return value is given, commission is
    calculated as 2% of the Salesman's annualSales number. Then a check is in place to
    set the cap of that commission to $20,000 if the number turns out to be greater than
    that value. Finally, the value of commission is added to the super method of annualSalary
    and given as the return value.
     */
    @Override
    public double annualSalary() {
        double commission = this.annualSales * .02;

        // The maximum commission a salesman can earn is $20,000.
        if (commission > 20000) {
            commission = 20000;
        }

        return super.annualSalary() + commission;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnnual Sales: \t\t\t" +
                df.format(this.annualSales);
    }

    /*
            Getters and Setters
     */

    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getMonthlySalary() {
        return super.getMonthlySalary();
    }

    @Override
    public void setMonthlySalary(double monthlySalary) {
        super.setMonthlySalary(monthlySalary);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }
}
