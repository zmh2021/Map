package com.hashtable_;

import java.util.Hashtable;

/**
 * @author Vhong
 * @version 1.0
 */
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        // 1.key和value都不能为null否则会抛出NullPointerException
        //table.put(null,100);
        //table.put(100,null);

        //2.HashTable的使用方法基本上与HashMap一样
        //3.hashTable是线程安全的（synchronized），HashMap是线程不安全的
        /*
         public synchronized V put(K key, V value){.....}
         */

        table.put("john",100);//ok
       // table.put(null,100);//异常
        //table.put("john",null);//异常
        table.put("lucy",100);//OK
        table.put("lic",100);//ok
        table.put("lic",88);//替换
        table.put("hello1",1);
        table.put("hello2",1);
        table.put("hello3",1);
        table.put("hello4",1);
        table.put("hello5",1);
        table.put("hello6",1);
        table.put("hello7",1);
        //threshold:23*0.75 = 17
        System.out.println("table="+table);

        //简单说明一下HashTable的底层
        //1.底层有一个数组 Hashtable$Entry[] 初始化大小为11
        //2.临界值threshold 8 = 11 * 0.75
        //3.扩容：按照自己的扩容机制进行即可
        //4.执行 方法addEntry(hash, key, value, index);添加K-V封装到Entry
        //5.当if(count >= threshold)满足时，就进行扩容
        //  按照int newCapacity = （oldCapacity << 1）+ 1;的大小扩容

    }
}
