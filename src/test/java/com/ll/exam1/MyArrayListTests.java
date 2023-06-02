package com.ll.exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.AssertEquals.assertEquals;
public class MyArrayListTests {
    @Test
    @DisplayName("size()")
    void t1(){
        MyArrayList<String> list = new MyArrayList<>();
//        assertEquals(0,list.size());
        assertThat(list.size()).isEqualTo(0);
    }

}
