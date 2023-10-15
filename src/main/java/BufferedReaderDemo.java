import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("myFile.txt");

        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}

