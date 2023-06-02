package com.ll.exam1;

import java.util.ArrayList;

public class MyArrayList<T> {
    private int size = 0;
//    private String[] data = new String[0];
    private String[] data;

    public MyArrayList() {
        this(0);
    }
    public MyArrayList(int InitialDataLen) {
        data = new String[InitialDataLen];
    }

    public int size() {
        return data.length;
    }

    public boolean add(String e) {
        makeNewDataIfNotEnough();
        data[size] = e;
        size++;
        return true;
    }

    private void makeNewDataIfNotEnough() {
        if (isNotEnough()){
            makeNewData();
        }
    }

    private void makeNewData() {
        String[] newData = new String[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData; // 기존 배열 최신화
    }

    private boolean isNotEnough() {
        return size == data.length;
    }

    public String get(int idx) {
        return data[idx-1];
    }
}
