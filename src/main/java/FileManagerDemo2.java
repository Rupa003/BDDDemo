import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
   /* public FileVisitResult visitFileFailed(Path file, IOException exe) throws IOException {
        System.err.println(exe.getMessage());
        return FileVisitResult.CONTINUE;
    }*/
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.err.println("About to visit "+ dir);
        //keep on navigating the tree
        return FileVisitResult.CONTINUE;
    }

    @Override
  /*  public FileVisitResult postVisitDirectory(Path dir, IOException exe) throws IOException {
        System.out.println("Just visited " + dir);
        //keep on navigating the tree
        return FileVisitResult.CONTINUE;
    }*/
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(attrs.isRegularFile()){
            System.out.println("Regular File");
        }
        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }
}


class VisitorDemo{
    public static void main(String[] args) throws Exception {
        Path path= Paths.get("files");
        MyFileVisitor visitor= new MyFileVisitor();
        Files.walkFileTree(path, visitor);
    }
}
