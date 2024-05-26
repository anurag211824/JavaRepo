package JavaCodes.FileHandling.A_Create_And_Delete_File;

import java.io.*;

public class Create_And_Delete_File {
    public static void main(String[] args) throws IOException { //f1.createNewFile(); throws error
        // Create a new File object with the specified path.
        // Using forward slashes for cross-platform compatibility.
        File f1 = new File("JavaCodes/FileHandling/file1.txt");

        // Attempt to create the new file. If the file already exists, this will do nothing.
        f1.createNewFile();

        // Check if the file exists and print the result.
        System.out.println("Is file exists: " + f1.exists());

        // Check if the file can be written to and print the result.
        System.out.println("Can file be written: " + f1.canWrite());

        // Get the name of the file and print it.
        System.out.println("File name is: " + f1.getName());

        // Get the length of the file in bytes and print it.
        System.out.println("Length of file: " + f1.length());

        // Get the absolute path of the file and print it.
        System.out.println("Absolute path of file: " + f1.getAbsolutePath());

        //used to delete the file
        //f1.delte();
    }
}
