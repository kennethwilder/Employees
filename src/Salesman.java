/**
 * Created by Thomas on 8/22/2015.
 */
public class Salesman extends Employee {

    private double annualSales;

    public Salesman() {

    }

    public Salesman(String name, double monthlySalary, double annualSales) {
        super(name, monthlySalary);
        this.annualSales = annualSales;
    }

    @Override
    public double annualSalary(double monthlySalary) {
        double commission = this.annualSales * .02;

        // The maximum commission a salesman can earn is $20,000.
        if (commission > 20000) {
            commission = 20000;
        }

        return super.annualSalary(monthlySalary) + commission;
    }

    @Override
    public String toString() {
        return "\nAnnual Sales: " + annualSales;
    }
}
