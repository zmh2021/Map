package com.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vhong
 * @version 1.0
 */
public class Map_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       //Map 接口实现类的特点
        //1.Map与Collection并列存在，用于保存具有映射关系的数据：Key-Value(双列元素)
       //2.Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node 对象中
        Map map = new HashMap();
        map.put(1,'a');//k-v
        map.put(2,'b');
        map.put(3,'c');
        map.put(4,'e');
        //3.HashMap中的Key不能重复，原因和HashSet一样
        map.put(4,'d');//当有相同的Key时，新的值替换旧的值
        //4.Map中的value可以重复
        map.put(5,'d');// new Node


        //5.Map的key可以为null，value也可以为null，只能有一个，value为null，可以有多个
        map.put(null,null);
        map.put(null,"abc");//这里等价替换
        map.put(6,null);
        map.put(7,null);

        //6.常用String一般作为Map的key
        map.put(new Object(),"jack");

        //7.key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value

        //System.out.println(map.get(3));
        System.out.println("map="+map);





    }
}
