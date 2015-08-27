import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Thomas on 8/22/2015.
 */
public class TestEmployee {

    public void builder(String[] args) {
        try {
            String content = new Scanner(new File(args[0]))
            .useDelimiter("\\Z") // To the end of the file
            .next();

            String[] line = content.split("\n");
            String[][] sheet = new String[line.length][];

            // Fills the 2D array
            for (int i = 0; i < line.length; i++) {
                sheet[i] = line[i].split("\\t");
            }

            // Prints the contents of the file as a 2D matrix
            for (String[] row : sheet) {
                for (String cell : row) {
                    System.out.println(cell + "\t");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void main(String[] args) {
        TestEmployee list = new TestEmployee();
        list.builder(args);
    }
}
