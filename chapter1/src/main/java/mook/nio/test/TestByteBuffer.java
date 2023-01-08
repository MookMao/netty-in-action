package mook.nio.test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class TestByteBuffer {
    public static void main(String[] args) {
//         分配空间
//        System.out.println(ByteBuffer.allocate(10));
//        System.out.println(ByteBuffer.allocateDirect(10));
        /**
         * class java.nio.HeapByteBuffer   - java 堆内存，读写效率较低，受 GC 影响
         * class java.nio.DirectByteBuffer - 直接内存，读写效率高（少一次数据拷贝），不会受 GC 影响，分配的效率低
         */


//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        System.out.println(buffer);         // [pos=0 lim=10 cap=10]
//        buffer.put((byte) 127);
//        System.out.println(buffer);         // [pos=1 lim=10 cap=10]
//        buffer.flip();                      // 切换为读模式
//        System.out.println(buffer);         // [pos=0 lim=1 cap=10]
//        System.out.println(buffer.get());
//        System.out.println(buffer);         // [pos=1 lim=1 cap=10]
//        System.out.println(buffer.get());   // Throws:BufferUnderflowException – If the buffer's current position is not smaller than its limit


//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        buffer.put(new byte[]{'a', 'b', 'c', 'd'});
//        System.out.println(buffer);           // [pos=4 lim=10 cap=10]
//        buffer.flip();
//        System.out.println(buffer);           // [pos=0 lim=4 cap=10]
//        buffer.get(new byte[4]);
//        System.out.println(buffer);           // [pos=4 lim=4 cap=10]
//        buffer.rewind();
//        System.out.println(buffer);           // [pos=0 lim=4 cap=10]
//        System.out.println((char) buffer.get()); // a


//        // mark & reset
//        // mark 做一个标记，记录 position 的位置，reset 是将 position 重置到 mark 的位置
//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        buffer.put(new byte[]{'a', 'b', 'c', 'd'});
//        buffer.flip();
//        System.out.println(buffer);                 // [pos=0 lim=4 cap=10]
//        System.out.println((char) buffer.get());    // a
//        System.out.println((char) buffer.get());    // b
//        System.out.println(buffer);                 // [pos=2 lim=4 cap=10]
//        buffer.mark();                              // 加标记，记录索引 2 的位置
//        System.out.println((char) buffer.get());    // c
//        System.out.println((char) buffer.get());    // d
//        System.out.println(buffer);                 // [pos=4 lim=4 cap=10]
//        buffer.reset();                             // 将 position 重置到索引 2
//        System.out.println(buffer);                 // [pos=2 lim=4 cap=10]
//        System.out.println((char) buffer.get());    // c


//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        buffer.put(new byte[]{'a', 'b', 'c', 'd'});
//        buffer.flip();
//        System.out.println(buffer);                    // [pos=0 lim=4 cap=10]
//        System.out.println((char) buffer.get(2));      // c
//        System.out.println(buffer);                    // [pos=0 lim=4 cap=10]
//        System.out.println((char) buffer.get(4));      // IndexOutOfBoundsException


//        // 1. 字符串 → 字节数组 → ByteBuffer
//        ByteBuffer buffer1 = ByteBuffer.allocate(16);
//        buffer1.put("hello".getBytes());
//        System.out.println(buffer1);        // [pos=5 lim=16 cap=16]
//        // 2. StandardCharsets 工具类
//        ByteBuffer buffer2 = StandardCharsets.UTF_8.encode("hello");
//        System.out.println(buffer2);        // [pos=0 lim=5 cap=5] 已切为读模式
//        // 3. wrap
//        ByteBuffer buffer3 = ByteBuffer.wrap("hello".getBytes());
//        System.out.println(buffer3);        // [pos=0 lim=5 cap=5] 已切为读模式
//        // 4. StandardCharsets 工具类
//        String s1 = StandardCharsets.UTF_8.decode(buffer2).toString();
//        System.out.println(s1);
//
//        buffer1.flip();
//        String s2 = StandardCharsets.UTF_8.decode(buffer1).toString();
//        System.out.println(s2);
    }
}
