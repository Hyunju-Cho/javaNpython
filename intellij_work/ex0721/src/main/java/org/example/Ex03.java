package org.example;

import java.util.StringTokenizer;

public class Ex03 {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("08:07:06",":"); //메모리 적게 사용
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
