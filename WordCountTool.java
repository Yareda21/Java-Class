import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountTool {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int wordCount = 0;
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            System.out.println("Word count: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}