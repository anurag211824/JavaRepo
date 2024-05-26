package JavaCodes.FileHandling.E_ReadingFile_BufferedReader;

import java.io.*;

public class ReadingBuffered {
    public static void main(String[] args) throws IOException {
        String filePath = "JavaCodes/FileHandling/E_ReadingFile_BufferedReader/file1.txt";

        FileReader fr = new FileReader(filePath);

        // Create a BufferedReader object to read from the file
        BufferedReader reader = new BufferedReader((fr));

        // Read each line from the file until reaching the end
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line); // Print each line to the console
        }

        // Close the BufferedReader
        reader.close();
    }
}
