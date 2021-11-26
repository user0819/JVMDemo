package com.atguigu.java;

public class ByteCodeTest {
    public static void main(String[] args) {
       // add();
        for (int i = 0; i < 20; i++) {
            int a = i+2;
            System.out.println(a);
        }
    }

    private static void add() {
        int xiao = 500, liu = 100, a = xiao / liu;
        int b = 50;
        System.out.println(a + b);
    }
}
