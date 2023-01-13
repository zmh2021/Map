package com.hashmap_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author Vhong
 * @version 1.0
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

//        for (int i = 0; i <= 12; i++) {
//            hashMap.put(new A(i),"hello");
//        }
//
//        hashMap.put("aaa","bbb");
//
//        System.out.println("hashMap="+hashMap);//12个 k-v
//        System.out.println();


        //任务：自己设计代码去验证，table的扩容
        //0 -> 16(12) -> 32(24) -> 64(48) -> 128 (96)

        for (int i = 0; i <= 12; i++) {
            hashMap.put(i,"hello");
        }

        hashMap.put("aaa","bbb");

        System.out.println("hashMap="+hashMap);//12个 k-v


    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    //所有的A对象的hashCode都是100
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}