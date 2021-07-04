import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cou {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("cupboard/clothes.txt");
        Scanner scanner = new Scanner(file);

        File output = new File("cupboard/quantity.txt");
        PrintWriter zero = new PrintWriter(output);

        while (scanner.hasNextLine()){
            String[] array = scanner.nextLine().split(";");
            if (Integer.parseInt(array[2]) == 0){
                zero.println(array[0] + ", " + array[1] + ", " + array[2]);
            }
        }
        zero.close();
        scanner.close();
    }
}
