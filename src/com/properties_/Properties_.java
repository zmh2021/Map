package com.properties_;

import java.util.Properties;

/**
 * @author Vhong
 * @version 1.0
 */
public class Properties_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1.Properties 继承 hashtable
        //2.可以通过k-v 存放数据，当然key 和value 不能为null
        //增加
        Properties properties = new Properties();
        properties.put("john",100);
        //properties.put(null,100);//抛出空指针异常
        //properties.put(100,null);

        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88);//如果有相同的key，value被替换

        System.out.println("properties="+properties);

        //通过k 获取对应值
        System.out.println(properties.get("lic"));

        //删除
        properties.remove("lic");
        System.out.println("properties="+properties);

        //修改
        properties.put("john","约翰");
        System.out.println("properties="+properties);



    }
}
