import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("myFile.txt", true);
        fw.write(97);
        fw.write("\n");
        fw.write(" Trying hard to understand filewriter class  ");
        fw.write("\n");
        fw.write(new char[]{'R', 'U', 'P', 'A'});
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
