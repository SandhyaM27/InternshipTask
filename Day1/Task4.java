package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {

        String filePath = "C://Users//ASHOK//Desktop//INTERSHIP TASK//Day1//sandhya.txt/";

        try {
            // FileReader reads the file
            FileReader fileReader = new FileReader(filePath);

            // BufferedReader makes reading efficient
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read each line until end of file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
