package com.atguigu.java;

/**
 * @author shkstart  shkstart@126.com
 * @create 2020  17:16
 */
public class ObjectTest {
    public static void main(String[] args) {
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object obj = new Object();
    }
}
