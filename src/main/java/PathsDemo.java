import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathsDemo {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("myFile2.txt");//Path can point to a directory or file

        System.out.println("Does file myFile2.txt exists? :"+ Files.exists(p));
        System.out.println(" Whole path : "+ p.toString());
        System.out.println("File Name : "+ p.getFileName());
        System.out.println("Absolute path :"+ p.toAbsolutePath());
        System.out.println("Count : "+ p.getNameCount());
        System.out.println(" Name : "+ p.getName(0));
        Files.createFile(p);
        System.out.println("After createFile? Does file myFile.txt exists? :"+ Files.exists(p));
        //This works with real path which exists. If specified path does not exist in real it throws exception.

        System.out.println(p.toRealPath((LinkOption.NOFOLLOW_LINKS) ));

        Path myDir= Paths.get("myDir");// Path can point to a directory or file
        System.out.println("Does myDir exists? :"+ Files.exists(myDir));
        System.out.println(myDir.toString());
        System.out.println(myDir.getFileName());
        System.out.println(myDir.toAbsolutePath());
        System.out.println(myDir.getNameCount());
        System.out.println(myDir.getName(0));
        Files.createDirectory(myDir);
        System.out.println("After createFile? Does file myFile.txt exists? :"+ Files.exists(myDir));
        System.out.println(myDir.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
}
