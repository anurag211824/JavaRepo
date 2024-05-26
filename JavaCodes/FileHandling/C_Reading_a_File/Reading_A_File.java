package JavaCodes.FileHandling.C_Reading_a_File;

import java.io.*;

public class Reading_A_File {
    private static int i;

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("JavaCodes/FileHandling/C_Reading_a_File/file1.txt");
        do {
            int i = fin.read();
            if (i != -1)
                System.out.print((char)(i));
        } while (i != -1);
        fin.close();
    }
}
