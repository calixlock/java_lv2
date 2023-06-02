package com.ll.exam1;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.stream.IntStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@TestMethodOrder(MethodOrderer.MethodName.class)
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
        int dataLen1 = ((Object[]) TestUt.getFieldValue(list, "data", null)).length;

//        list.add("a");
//        list.add("b");
//        list.add("c");
        IntStream.rangeClosed(1,11)
                        .forEach(idx -> list.add("element %d".formatted(idx)));
        assertThat(list.get(1)).isEqualTo("element 1");

//        assertThat(list.size()).isEqualTo(3);
        int dataLen2 = ((Object[]) TestUt.getFieldValue(list, "data", null)).length;
        assertThat(dataLen2).isGreaterThan(dataLen1);
    }
    @Test
    @DisplayName("dataLen 초기값")
    void t5() {
        MyArrayList<String> list = new MyArrayList<>(100);

        //        assertThat(list.size()).isEqualTo(100);
        int dataLen = ((Object[]) TestUt.getFieldValue(list,"data",null)).length;
        assertThat(dataLen).isEqualTo(100);
    }
    @Test
    @DisplayName("dataLen Debug")
    void t6() {

        MyArrayList<String> list = new MyArrayList<>(100);
//        list.debug = true;
        //        assertThat(list.size()).isEqualTo(100);
        IntStream.rangeClosed(1,110)
                .forEach(idx -> list.add("element %d".formatted(idx)));
        int dataLen = ((Object[]) TestUt.getFieldValue(list,"data",null)).length;
        assertThat(dataLen).isEqualTo(110);
    }
    @Test
    @DisplayName("index of")
    void t7(){
    MyArrayList<String> list = new MyArrayList<>(100);
    IntStream.rangeClosed(1,10)
            .forEach(idx -> list.add("element %d".formatted(idx)));
        assertThat(list.indexOf("element 2")).isEqualTo(1);
        assertThat(list.indexOf("element 4")).isEqualTo(3);
        assertThat(list.indexOf("element 9")).isEqualTo(8);
    }
    @Test
    @DisplayName("index of")
    void t8(){
        MyArrayList<String> list = new MyArrayList<>(100);
        list.add(true);
        list.add(false);
        assertThat(list.get(1)).isEqualTo(true);


    }
}