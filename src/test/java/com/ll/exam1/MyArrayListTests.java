package com.ll.exam1;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class MyArrayListTests {
    @Test
    @DisplayName("size()")
    void t1() {
        MyArrayList<String> list = new MyArrayList<>();
//        assertEquals(0,list.size());
        assertThat(list.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("add()")
    void t2() {
        MyArrayList<String> list = new MyArrayList<>();
//        assertThat(list.size()).isEqualTo(0);
        list.add("a");
        list.add("b");
        list.add("c");
        assertThat(list.size()).isEqualTo(3);

    }

    @Test
    @DisplayName("get(1)")
    void t3() {
        MyArrayList<String> list = new MyArrayList<>();
//        assertThat(list.size()).isEqualTo(0);

        list.add("a");
        list.add("b");
        list.add("c");
        assertThat(list.get(3)).isEqualTo("c");

//        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("data len 증가 확인")
    void t4() {
        MyArrayList<String> list = new MyArrayList<>();
        int dataLen1 = ((String[]) TestUt.getFieldValue(list, "data", null)).length;

        list.add("a");
        list.add("b");
        list.add("c");
        assertThat(list.get(1)).isEqualTo("a");

//        assertThat(list.size()).isEqualTo(3);
        int dataLen2 = ((String[]) TestUt.getFieldValue(list, "data", null)).length;
        assertThat(dataLen2).isGreaterThan(dataLen1);
    }
    @Test
    @DisplayName("dataLen 초기값")
    void t5() {
        MyArrayList<String> list = new MyArrayList<>(100);

        //        assertThat(list.size()).isEqualTo(100);
        int dataLen = ((String[]) TestUt.getFieldValue(list,"data",null)).length;
        assertThat(dataLen).isEqualTo(100);
    }
}