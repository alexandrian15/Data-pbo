/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data.alex;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class MemoryStorage2 implements DataStorage{
    private final ArrayList<String> data;
    public MemoryStorage2() {
    this.data = new ArrayList<>();
    }

    @Override
    public void writeData(String data) {
    this.data.add(data);
    }

    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        this.data.forEach((item) -> {
            sb.append(item);
        });
        return sb.toString();
}
}