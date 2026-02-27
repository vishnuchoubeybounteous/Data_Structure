package cses.collections;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
 
class FileExistException extends Exception {
    public FileExistException(String message) {
        super(message);
    }
}
 
class FileWriterTask implements Runnable {
    private Path path;
    private String content;
    public FileWriterTask(Path path, String content) {
        this.path = path;
        this.content = content;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " started writing");
            Files.writeString(
                    path,
                    Thread.currentThread().getName() + ": " + content + "\n",
                    StandardCharsets.UTF_8,
                    StandardOpenOption.APPEND
            );
            System.out.println(Thread.currentThread().getName() + " finished writing");
 
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
       
    }
}
 
public class MultiThreadFileWrite {
    public static void main(String[] args) {
        Path inputPath = Path.of("thread.txt");
        Thread t1 = new Thread(
                new FileWriterTask(inputPath, "Java is used in backend development."),
                "Thread-1"
        );
 
        Thread t2 = new Thread(
                new FileWriterTask(inputPath, "Java supports multithreading."),
                "Thread-2"
        );
 
        t1.start();
        t2.start();
 
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
 
        try {
            String content = Files.readString(inputPath, StandardCharsets.UTF_8);
            System.out.println("\nFinal File Content:");
            System.out.println(content);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
 