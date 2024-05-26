package JavaCodes.FileHandling.B_Writing_To_File;

import java.io.*;

public class Writing_To_File_Using_Diff_Constructor {
    public static void main(String[] args) throws Exception {
            
            // Writing to a file using the constructor FileOutputStream(String name)
            // This will overwrite the file if it exists
            FileOutputStream fout1 = new FileOutputStream("JavaCodes/FileHandling/B_Writing_To_File/file1.txt");
            writeToStream(fout1, "Writing to file1 using FileOutputStream(String name)");
            
            // Writing to a file using the constructor FileOutputStream(File file)
            // This will overwrite the file if it exists
            File file2 = new File("JavaCodes/FileHandling/B_Writing_To_File/file2.txt");
            FileOutputStream fout2 = new FileOutputStream(file2);
            writeToStream(fout2, "Writing to file2 using FileOutputStream(File file)");

            // Writing to a file using the constructor FileOutputStream(String name, boolean append)
            // This will append to the file if it exists
            FileOutputStream fout3 = new FileOutputStream("JavaCodes/FileHandling/B_Writing_To_File/file3.txt", true);
            writeToStream(fout3, "Appending to file3 using FileOutputStream(String name, boolean append)");

            // Writing to a file using the constructor FileOutputStream(File file, boolean append)
            // This will append to the file if it exists
            File file4 = new File("JavaCodes/FileHandling/B_Writing_To_File/file4.txt");
            FileOutputStream fout4 = new FileOutputStream(file4, true);
            writeToStream(fout4, "Appending to file4 using FileOutputStream(File file, boolean append)");

        
    }

    // Method to write a string to a given FileOutputStream
    public static void writeToStream(FileOutputStream fout, String content) throws IOException {
        // Convert the string into a character array
        char arr[] = content.toCharArray();

        // Loop through each character in the array and write it to the file
        for (int i = 0; i < arr.length; i++) {
            fout.write(arr[i]);
        }

        // Add a newline for clarity when appending
        fout.write('\n');

        // Close the FileOutputStream to release the resources
        fout.close();
    }
}
