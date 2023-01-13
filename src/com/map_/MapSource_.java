package com.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Vhong
 * @version 1.0
 */
public class MapSource_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "a");
        map.put(2, "b");
        map.put(new Car(),new Person());
        //1.k-v 最后是HaspMap$Node node =  newNode（hash,key,value,null）
        //2.k-v 为了方便程序员的遍历，还会 创建 EntrySet 集合，该集合存放的元素的类型 Entry
        // 对象就有k，v EntrySet<Entry<K,V>>,即：transient Set<Map.Entry<K,V>> entrySet;

        //3.在entrySet中，定义的类型是 Map.Enter，但实际上存放的还是 HashMap$Node
        //这是因为HashMap$Node implements Map.Entry<K,V>
        //4.当把 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历，因为 Map.Entry提供重要的方法
        //K getValue(); V getValue();
        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet

        for (Object obj : set) {//HashMap$Node
            // System.out.println(entry.getClass());
            //为了从 HashMap$Node 取出k-v
            //1.先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

            Set set1 = map.keySet();

            System.out.println(set1.getClass());
            Collection values = map.values();
        System.out.println(values.getClass());
    }
}
class Car{

}
class Person{

}