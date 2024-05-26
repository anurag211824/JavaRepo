package JavaCodes.FileHandling.D_WritingFile_BufferedWriter;
import java.io.*;
public class WritingBuffered {
    public static void main(String[] args) throws IOException {
        //file writer is a sub class of Writer class
        FileWriter fw=new FileWriter("JavaCodes/FileHandling/D_WritingFile_BufferedWriter/file1.txt",true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("My name is anurag kumar");
        bf.close();

    }
    
}
