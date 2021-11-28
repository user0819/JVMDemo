package com.atguigu.java;

/**
 * 设置jmx参数
 * -Djava.rmi.server.hostname=10.160.13.111
 * -Dcom.sun.management.jmxremote
 * -Dcom.sun.management.jmxremote.port=3214
 * -Dcom.sun.management.jmxremote.ssl=false
 * -Dcom.sun.management.jmxremote.authenticate=false
 * -Dcom.sun.management.jmxremote.password=123456
 *
 * -Djava.rmi.server.hostname=10.160.13.111 -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=3214 -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false
 */
public class JConsoleTest {
    public static void main(String[] args) throws InterruptedException {
        int count = 100;
        while(count >= 0){
            System.out.println("sleeping");
            Thread.sleep(1000 * 10);
            System.out.println("awake");
            count--;
        }
        System.out.println("end");
    }
}
