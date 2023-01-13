package com.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Vhong
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {

        Map map = new HashMap();
        //添加对象
        map.put(1001, new Employee("jack", 30000, 1001));
        map.put(1002, new Employee("tom", 14000, 1002));
        map.put(1003, new Employee("john", 50000, 1003));

        //遍历两种方式
        //1.使用keySet -> 增强for
        System.out.println("==========第一种遍历方式==========");
        Set keyset = map.keySet();
        for (Object key : keyset) {
            //先获取value,再向下转型
            Employee emp = (Employee)map.get(key);
            //判断工资
            if(emp.getSalary() > 18000)
            System.out.println(emp);
        }
        //2.使用EnterSet -> 迭代器
        // 体现比较难的知识点
        System.out.println("===========迭代器==================");
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            //通过entry 取得 key和value
             Employee emp = (Employee)entry.getValue();
                if(emp.getSalary() > 18000){
                    System.out.println(emp);
                }
        }
    }
}
class Employee{
    private String name;
    private double salary;
    private int id;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}