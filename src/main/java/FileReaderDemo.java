import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File f= new File("myFile.txt");
        FileReader fr= new FileReader(f);
        int data=fr.read();
        while(data!= -1){
            System.out.println((char) data);
            data=fr.read();

        }
        char ch[]= new char[(int)f.length()];
        FileReader fr1= new FileReader(f);
        fr1.read(ch);
        for(char c: ch){
            System.out.println(c);
        }

        fr.close();


    }
}
