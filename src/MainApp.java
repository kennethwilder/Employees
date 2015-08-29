import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Thomas Hodges on 8/22/2015.
 *
 * Filename: MainApp.java
 *
 * Course: CMIS 242 - Intermediate Programming
 * Professor: Ioan Salomie
 * Assignment: Project 1
 *
 * Platform: Windows 10, IntelliJ IDEA 14.1.4
 * Compiler: jdk1.8.0_45
 */
public class MainApp {

    // Private ArrayLists for each year of employee data
    private ArrayList<Employee> employeeArrayList2014 = new ArrayList<>();
    private ArrayList<Employee> employeeArrayList2015 = new ArrayList<>();

    // Private DecimalFormat object to be used by functions in the MainApp class
    private static DecimalFormat df = new DecimalFormat("$0.00");

    /*
    The builder() method points to the "data.txt" file located at the root of the
    project folder. It uses the Scanner class to initialize variables between each
    space " " character. The input file should contain the year, employee type, name,
    monthly salary, and optionally the annual sales or stock price if the employee type
    is either Salesman or Executive, respectively. Finally, the input file should end
    with a blank line in order for the Scanner class to complete its operation. Each
    line will create an employee in either the employeeArrayList2014 or employeeArrayList2015
    ArrayLists depending on the first element of each line.
     */

    public void builder() {

        try {

            Scanner input = new Scanner(new File("data.txt"));

            // Completes loop when "input.nextLine();" below detects no data
            while (input.hasNext()) {

                int year = input.nextInt();

                // Tests for 2014 in the first element
                if (year == 2014) {
                    String type = input.next();
                    String name = input.next();
                    double monthlySalary = input.nextDouble();

                    // Tests for Salesman in the second element
                    if (type.equals("Salesman")) {
                        double salesOrStock = input.nextDouble();
                        employeeArrayList2014.add(new Salesman(year, name, monthlySalary, salesOrStock));

                    // Tests for Executive in the second element
                    } else if (type.equals("Executive")) {
                        double salesOrStock = input.nextDouble();
                        employeeArrayList2014.add(new Executive(year, name, monthlySalary, salesOrStock));

                    // If neither Salesman or Executive test happened, it is an Employee
                    } else {
                        employeeArrayList2014.add(new Employee(year, name, monthlySalary));
                    }

                // Tests for 2015 employees
                } else if (year == 2015) {
                    String type = input.next();
                    String name = input.next();
                    double monthlySalary = input.nextDouble();

                    // Tests for Salesman in the second element
                    if (type.equals("Salesman")) {
                        double salesOrStock = input.nextDouble();
                        employeeArrayList2015.add(new Salesman(year, name, monthlySalary, salesOrStock));

                        // Tests for Executive in the second element
                    } else if (type.equals("Executive")) {
                        double salesOrStock = input.nextDouble();
                        employeeArrayList2015.add(new Executive(year, name, monthlySalary, salesOrStock));

                    // If neither Salesman or Executive test happened, it is an Employee
                    } else {
                        employeeArrayList2015.add(new Employee(year, name, monthlySalary));
                    }
                }

                // Completes when a blank line is detected
                input.nextLine();

            }

        } catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("A null pointer was found, please check the input file.");
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            System.out.println("The last line of the document is not blank.");
            e.printStackTrace();
        }
    }

    /*
    The displayAllEmployees() method prints the toString() method for each object
    created in the employeeArrayList2014 and employeeArrayList2015 ArrayLists. As
    it iterates through the lists, the annualSalary() for each employee-based object
    is also added to a averageSalary2014 or averageSalary2015 variable so that all
    employees of that year has their salaries added in one variable. Then that variable
    is divided by the length of the ArrayList by using the size() method to determine
    the average salary. Last, that number is formatted with the DecimalFormat object
    and printed to the console.
     */

    public void displayAllEmployees() {

        // Placeholder variables to sum and average the salary
        double averageSalary2014 = 0;
        double averageSalary2015 = 0;

        // Iterate through, and display 2014 data first
        System.out.println("\n2014 Data:");
        for (Employee em : employeeArrayList2014) {
            System.out.println(em.toString());
            averageSalary2014 += em.annualSalary();

        }

        // averageSalary2014's final value should be itself divided by the number of employees
        averageSalary2014 = averageSalary2014 / employeeArrayList2014.size();
        System.out.println("=========================================");
        System.out.println("The average salary for 2014 was: " + df.format(averageSalary2014));

        // Iterate through, and display 2015 data after 2014 has completed
        System.out.println("\n2015 Data:");
        for (Employee em : employeeArrayList2015) {
            System.out.println(em.toString());
            averageSalary2015 += em.annualSalary();
        }

        // averageSalary2015's final value should be itself divided by the number of employees
        averageSalary2015 = averageSalary2015 / employeeArrayList2015.size();
        System.out.println("=========================================");
        System.out.println("The average salary for 2015 was: " + df.format(averageSalary2015));
    }

    public static void main(String[] args) {
        MainApp list = new MainApp();
        list.builder();
        list.displayAllEmployees();
        
    }
}
