package com.sparta.aa.fileio;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class App {
    public static void main(String[] args) {
        Path input = Paths.get("src/main/java/com/sparta/aa/fileio/input.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(input);
        } catch (IOException e) {
            System.out.println("File has not be found!");
        }
    }
}
