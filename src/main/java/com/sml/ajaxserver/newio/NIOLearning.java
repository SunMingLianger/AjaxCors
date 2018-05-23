package com.sml.ajaxserver.newio;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * newio non-block-io
 * Created by 神迷的亮
 * 2018-05-23 10:37
 */
public class NIOLearning
{
    public static void main(String[] args)
    {
        /*
         IO（ input output）和 NIO（ new IO 或 non-block IO）区别
         NIO 是 jdk1.4 出现的
         l IO：面向流，单向的，阻塞式（本线程在读写的时候，程序阻塞），一个线程操作
         一个连接；
         l NIO：面向块（缓冲区），双向的，非阻塞式（本线程在读写的时候，程序还可以
         继续干别的事），一个线程可以操作多个连接（使用选择器来管理多个通道），在
         网络通信时最常用。
         n 几个关键： Channel（通道）， Buffer（缓冲区）， Selector（选择器）。
         n 7 种 Buffer，除了 Boolean 都有。 ByteBuffer 最常用
         n Selector 能够监测多个注册通道上是否有事件发生，如果有事件发生，便获取
         事件然后进行相应的处理。这样一来，一个单线程就可以管理多个通道，也就
         是管理多个连接
         n Buffer 的 3 个关键：
         */
        ByteBuffer buffer = ByteBuffer.allocate(20);

        String s = "abcdefg";
        buffer.put(s.getBytes());

        //分配
        System.out.println(buffer.capacity());
        System.out.println(buffer.limit());
        System.out.println(buffer.position());

        buffer.flip();//反转，从写模式转为读模式

        System.out.println("_____________________\t\n");
        System.out.println(buffer.capacity());
        System.out.println(buffer.limit());
        System.out.println(buffer.position());
        /**
         * 此时：
         * 写：容量 20，限制 20（不论写了多少内容，书写的限制一直是 20，因为还可
         * 以回去重新写），指针位置为 7（指向下一个位置）
         * 读：容量 20，限制 7（因为之前只写了 7 个，所以只能读 7 个），指针位置为
         * 0（从头来）
         */

        int[] arr = {122, 12, 33, -99, 233};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*冒泡排序*/
    private static void bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
