/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data.alex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class FileStorage implements DataStorage {
    private final String filePath;
    
    
    public FileStorage(String filePath) {
        this.filePath = filePath;
    }

   
    @Override
    public void writeData(String data) {
    try (FileWriter writer = new FileWriter(filePath)) {
        writer.write(data);
    } catch (IOException e) {
    }
}
    @Override
    public String readData() {
    StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new
        FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
        sb.append(line);
    }
    } catch (IOException e) {
    }
        return sb.toString();
    }
}