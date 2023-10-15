

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.Paths;

public class FileManageDemo {
    public static void main(String[] args) throws Exception {
        Path source = Paths.get("files/source.txt");
        System.out.println(source.getFileName());
        Path target = Paths.get("files/target.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
/*
       Path fileToDelete=Paths.get("files/fileToDelete.txt");
       Files.delete(Paths.get("fileToDelete"));
        System.out.println("File deleted successfully"); //1:36:40* 1:38:25

       Path newDir=Paths.get("files/newDir");
       Files.createDirectory(newDir);
        Files.move(source,newDir.resolve(source.getFileName()),StandardCopyOption.REPLACE_EXISTING);
    }
}

 */
    }}
