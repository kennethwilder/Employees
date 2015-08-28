/**
 * Created by Thomas on 8/22/2015.
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
        return super.toString() + "\nAnnual Sales: " + annualSales;
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
