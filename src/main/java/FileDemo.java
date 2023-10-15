import java.io.File;
import java.io.IOException;
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f1= new File("abc.txt");
        System.out.println("Does file abc.txt exists ? "+ f1.exists());
        f1.createNewFile();

        File dir= new File("C:\\Rupa");
        dir.mkdir();
        System.out.println(dir.exists());

        File fRupa= new File(dir, "lib.txt");
        fRupa.createNewFile();

        System.out.println("Does file lib.txt exists ? "+ f1.exists());
        File f2=new File("c:\\Software");
        String[] list = f2.list();
        int count=0;
        for(String fileName: list){
            count++;
            System.out.println(fileName);
        }

        System.out.println("Total no. of directories and files : "+count);
        int fileCount=0;
        for(String s: list){
            File f3=new File(f2, s);
            if(f3.isFile())// use f3.isDirectory() method to confirm if it is directory
                fileCount++;
        }
        System.out.println("Total no. of File count :"+ fileCount);
    }
}
