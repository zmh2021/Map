package com.map_;

import java.util.*;

/**
 * @author Vhong
 * @version 1.0
 */
public class Review01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Emp("jack",700000,1));
        map.put(2,new Emp("mary",2000,2));
        map.put(3,new Emp("jerry",20000,3));
    //第一种遍历方式
        System.out.println("=========增强for循环==============");
        Set keyset = map.keySet();
        for (Object key : keyset)
        {
            Emp emp = (Emp) map.get(key);
            if(emp.getSal() > 18000)
            System.out.println(emp);
        }
        //第二种遍历方式
        System.out.println("==========迭代器===================");
        Set entryset = map.entrySet();
        Iterator iterator = entryset.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Emp emp = (Emp) entry.getValue();
            if(emp.getSal() > 18000)
                System.out.println(emp);
        }

    }
}
class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
