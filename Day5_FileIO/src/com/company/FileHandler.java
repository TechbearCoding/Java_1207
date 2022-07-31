package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {

    private String filePath;

    public FileHandler(String filePath){
        setFilePath(filePath);
    }

    public void setFilePath(String filePath){
        this.filePath = filePath;
    }

    public String getFilePath(){
        return filePath;
    }

    public void writeFile(String text){

        try{
           FileWriter writer = new FileWriter(filePath, true);
           writer.write(text);
           writer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error!");
        }

    }

    public void readFile(){
        try{
            FileReader reader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error!");
        }
    }

    public String readAll(){
        try {
            return Files.readString(Path.of(filePath));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error!");
        }
        return "";
    }


}
