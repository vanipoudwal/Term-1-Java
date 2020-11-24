
package bufferedwriterdemo;

import java.io.*;
import java.nio.Charset.*;
import java.nio.file.*;

public class BufferedWriterDemo 
{
    public static void main(String[] args) 
    {
        String content = "Using the BufferedWriter class to write to a file.";
        Path file = Paths.get("D:/NewFile.txt");
        Charset charset = Charset.forName("US-ASCII");
        try(BufferedWriter writer = Files.newBufferedWriter(file, charset, StandardOpenOption.CREATE))
        {
            writer.write(content);
            System.out.println("Done");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
