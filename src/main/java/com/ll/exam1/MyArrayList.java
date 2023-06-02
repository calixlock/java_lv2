package com.ll.exam1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MyArrayList<T> {
    public boolean debug = false;
    private int size = 0;
//    private String[] data = new String[0];
    private Object[] data;

    public MyArrayList() {
        this(0);
    }
    public MyArrayList(int InitialDataLen) {
        data = new Object[InitialDataLen];
    }

    public int size() {
        return size;
//        return data.length;
    }

    public boolean add(T e) {
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
        Object[] newData = new String[data.length +1];
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

    public Object get(int idx) {
        return data[idx-1];
    }

    public int indexOf(String e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) return i;
        }
        return -1;
//        return IntStream.range(0,size)
//                .mapToObj(idx->new Object[]{idx, data[idx]})
//                .filter(arr-> e.equals(arr[1]))
//                .mapToInt(arr ->(int)arr[0])
//                .findFirst()
//                .orElse(-1);
    }
}
