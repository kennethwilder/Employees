/**
 * Created by Thomas on 8/22/2015.
 */
public class Executive extends Employee{

    private double currentStockPrice;

    public Executive() {

    }

    public Executive(String name, double monthlySalary, double currentStockPrice) {
        super(name, monthlySalary);
        this.currentStockPrice = currentStockPrice;
    }

    @Override
    public double annualSalary(double monthlySalary) {
        double bonus = 0;

        // The bonus is $30,000 if the current stock price is greater than $50 and nothing otherwise.
        if (this.currentStockPrice > 50) {
            bonus = 30000;
        }

        return super.annualSalary(monthlySalary) + bonus;
    }

    @Override
    public String toString() {
        return "\nCurrent Stock Price: " + currentStockPrice;
    }

}
