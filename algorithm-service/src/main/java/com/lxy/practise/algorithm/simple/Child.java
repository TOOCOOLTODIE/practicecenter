package com.lxy.practise.algorithm.simple;

/**
 * test
 * @author luo
 * @date 2022/07/31 13:28
 **/
public class Child extends Father{
    private String name = "child";

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getName());
    }

}
