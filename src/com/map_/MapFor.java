package com.map_;

import java.util.*;

/**
 * @author Vhong
 * @version 1.0
 */
public class MapFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","孙俪");//替换
        map.put("王宝强","马蓉");//OK
        map.put("宋jie","马蓉");//OK
        map.put("刘令博",null);//OK
        map.put(null,"刘亦菲");//OK
        map.put("鹿晗","关晓彤");//OK

        //第一组：先取出所有的Key，通过Key 取出对应的Value
        Set keyset = map.keySet();
        //(1)增强for
        System.out.println("------第一种方式------");
        for(Object key : keyset)
            System.out.println(key+" - "+map.get(key));

        //（2）迭代器
        System.out.println("------第二种方式------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key+" - "+map.get(key));
        }

        //第二组：把所有的values取出
        Collection values = map.values();
    //这里可以使用所有的Collections使用的遍历方法
        //(1)for增强
        System.out.println("------取出所有的value-----");
        for(Object value : values)
            System.out.println(value);

        //(2)迭代器
        System.out.println("-------取出所有的value 迭代器------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value =  iterator1.next();
            System.out.println(value);
        }

        //第三组：通过 EntrySet 来获取 k-v
        Set entryset = map.entrySet();//EntrySet<Entry<K,V>>
        //增强for
        System.out.println("-----使用EntrySet 的for增强（第3种）-----");
        for(Object entry : entryset)
        {
            //将entry 转成 Map.Entry//向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+" - "+ m.getValue());
        }
        //(2)迭代器
        System.out.println("---------迭代器-------");
        Iterator iterator2 = entryset.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            //向下转型 Map.Enter
            Map.Entry m = (Map.Entry) entry;
            //HashMap$Node - 实现->Map.Entry(getKey-getValue)
            System.out.println(m.getKey()+" - "+m.getValue());
        }

    }

}
