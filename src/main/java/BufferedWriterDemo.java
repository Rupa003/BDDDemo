import net.sf.saxon.trans.SymbolicName;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        File f= new File("myFile.txt");

        Writer w= new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(w);
        bw.write(99);
        bw.newLine();
        bw.write(new char[] {'R','U','P','A'});
        bw.newLine();
        bw.write("Rupa has become a test analyst");
        bw.flush();
        bw.close();

    }
}
