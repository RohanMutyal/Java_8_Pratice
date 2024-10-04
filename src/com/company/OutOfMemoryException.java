package com.company;

public class OutOfMemoryException extends Throwable {
    public static void main(String[] args) throws Exception, OutOfMemoryException {

        int arrSize = 15;
        System.out.println("Maximum memory " + Runtime.getRuntime().maxMemory());
        long memoryConsumed = 0;
        long[] memoryAllocated = null;
        for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
            memoryAllocated = new long[arrSize];
            memoryAllocated[0] = 0;
            memoryConsumed += arrSize * Long.SIZE;
            System.out.println("Memory Consumed: " + memoryConsumed);
            arrSize *= arrSize * 2;
            Thread.sleep(500);
        }
    }
}
