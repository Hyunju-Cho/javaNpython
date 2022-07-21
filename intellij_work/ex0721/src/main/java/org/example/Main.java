package org.example;

import javax.swing.*;

public class Main {
    public static void showData(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
    }
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(3);
        Integer integer1 = 5;

        showData(integer);
        showData(integer1);
        showData(new Integer(100));//지원 안하는 형식


    }
}