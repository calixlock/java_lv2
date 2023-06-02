package com.ll.exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class MyArrayListTests {
    @Test
    @DisplayName("size()")
    void t1(){
        MyArrayList<String> list = new MyArrayList<>();
//        assertEquals(0,list.size());
        assertThat(list.size()).isEqualTo(0);
    }
    @Test
    @DisplayName("add()")
    void t2(){
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        assertThat(list.size()).isEqualTo(2);

    }
    @Test
    @DisplayName("get(1)")
    void t3(){
        MyArrayList<String> list = new MyArrayList<>();
        assertThat(list.get(1)).isEqualTo("a");

    }
}
