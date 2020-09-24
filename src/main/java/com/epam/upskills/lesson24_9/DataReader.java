package com.epam.upskills.lesson24_9;

import java.io.Console;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataReader {
    public String readConsole(){          //считываем с консоли строку
        Console console = System.console();
        String data = console.readLine();
        return data;
    }

    public String readScanner(){
        String data = new Scanner(System.in).nextLine();
        return data;
    }
    public String read(String filename){
        String data = null;
        Path path = Paths.get(filename);
        if(File.exists(path)) && !Files.isDirectory(path) && Files.isRegularFile(path)
                try{
                    StringBuilder builder = new StringBuilder()
                }
    }
}
