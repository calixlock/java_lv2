package com.ll.exam1;

import java.util.ArrayList;

public class MyArrayList<T> {
    public boolean debug = false;
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
        return size;
//        return data.length;
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
        String[] newData = new String[data.length +1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        if (debug) {
            System.out.printf("배열 %d => %d\n".formatted(data.length,newData.length));
        }

        data = newData; // 기존 배열 최신화
    }

    private boolean isNotEnough() {
        return size == data.length;
    }

    public String get(int idx) {
        return data[idx-1];
    }

    public int indexOf(String e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) return i;
        }
        return -1;
    }
}
