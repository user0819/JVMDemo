package com.atguigu.java;

/**
 * -XX:+PrintCommandLineFlags
 *
 *
 * -XX:+UseSerialGC:表明新生代使用Serial GC ，同时老年代使用Serial Old GC
 *
 *
 * -XX:+UseParNewGC：标明新生代使用ParNew GC
 * -XX:+UseConcMarkSweepGC：表明老年代使用CMS GC。同时，年轻代会触发对ParNew 的使用

 *
 *
 * -XX:+UseParallelGC:表明新生代使用Parallel GC
 * -XX:+UseParallelOldGC : 表明老年代使用 Parallel Old GC
 * 说明：二者可以相互激活
 * -XX:MaxGCPauseMillis=10   设置垃圾收集器最大停顿时间
 * -XX:GCTimeRatio=99      设置吞吐量，默认就是99
 *
 *
 *
 *
 * @author shkstart  shkstart@126.com
 * @create 2020  0:10
 */
public class GCUseTest {
    public static void main(String[] args) {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
