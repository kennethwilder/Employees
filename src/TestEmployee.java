import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Thomas on 8/22/2015.
 */
public class TestEmployee {

    private ArrayList<Employee> employeeArrayList = new ArrayList<>();
    private ArrayList<Salesman> salesmanArrayList = new ArrayList<>();
    private ArrayList<Executive> executiveArrayList = new ArrayList<>();

    public void builder() {

        try {

            Scanner input = new Scanner(new File("data.txt"));

            while (input.hasNext()) {

                int year = input.nextInt();
                String type = input.next();
                String name = input.next();
                double monthlySalary = input.nextDouble();

                if (type.equals("Salesman")) {
                    double salesOrStock = input.nextDouble();
                    salesmanArrayList.add(new Salesman(year, name, monthlySalary, salesOrStock));

                } else if (type.equals("Executive")) {
                    double salesOrStock = input.nextDouble();
                    executiveArrayList.add(new Executive(year, name, monthlySalary, salesOrStock));

                } else {
                    employeeArrayList.add(new Employee(year, name, monthlySalary));
                }

                input.nextLine();

            }

        } catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Null pointer.");
            e.printStackTrace();
        }
    }

    public void toConsole() {
        for (Employee em : employeeArrayList) {
            System.out.println(em.toString());
        }

        for (Salesman sa : salesmanArrayList) {
            System.out.println(sa.toString());
        }

        for (Executive ex : executiveArrayList) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {
        TestEmployee list = new TestEmployee();
        list.builder();
        list.toConsole();
        
    }
}
