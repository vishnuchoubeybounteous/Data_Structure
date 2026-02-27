package cses.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class WriteIO {
    public static void main(String[] args) {
        // Path path = Path.of("data.txt");
        // try {
        //     if (Files.exists(path)) {
        //         throw new IOException("File already exists!");
        //     }
          
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // try{
        //   FileWriter writer = new FileWriter(path.toFile(),true);
        //     writer.write("How are you!");
        //     writer.close();
        // }
        // catch(Exception e){}

        String fileName = "data.txt";
        String wordToCount = "java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                String[] words = line.split("\\W+");
                for (String w : words) {
                    if (w.equals(wordToCount)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of occurrences of 'Java': " + count);
    }
}
