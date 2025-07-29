package viewCollection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main   {
    public static void main(String[] args) {
//          MyArray myArr = new MyArray();
//        myArr.addValue(56);
//        System.out.println(myArr.size());
//        System.out.println(myArr.getFromArray(0));
//        myArr.addValue(89);
//        System.out.println(myArr.size());
//        System.out.println(myArr.getFromArray(1));
//
//
//        // Task 2, fixed length queue class, addition.
//        MyQueue myQueue = new MyQueue();
//        try{
//            myQueue.addInLine(20);
//            myQueue.addInLine(30);
//            myQueue.addInLine(40);
//
//        } catch (Exception e) {
//            System.err.println(" " + e.getMessage());
//        }
//        System.out.println(myQueue);
//
//        try{
//            myQueue.addInLine(90);
//
//        } catch (Exception e) {
//            System.err.println(" " + e.getMessage());
//        }
//        System.out.println(myQueue);
//
//        // Task 2, fixed length queue class, Receiving from queue.
//        System.out.println(myQueue.sizeArray());
//        System.out.println(myQueue.getFromLine());
//        System.out.println(myQueue.sizeArray());
//


        // Task 3, fixed length queue class, addition.
        MyDeQueue myDeQueue = new MyDeQueue();
        try{
            myDeQueue.addToBegin(20);
            myDeQueue.addToBegin(30);
            myDeQueue.addToEnd(50);
            myDeQueue.addToBegin(80);
            System.out.println(myDeQueue.getFromEnd());
          //  myDeQueue.addToBegin(70);
          //  myDeQueue.getFromEnd();

        } catch (Exception e) {
            System.err.println(" " + e.getMessage());
        }
        System.out.println(myDeQueue);
//
//        try{
//            myQueue.addInLine(90);
//
//        } catch (Exception e) {
//            System.err.println(" " + e.getMessage());
//        }
//        System.out.println(myQueue);
//
//        // Task 2, fixed length queue class, Receiving from queue.
//        System.out.println(myQueue.sizeArray());
//        System.out.println(myQueue.getFromLine());
//        System.out.println(myQueue.sizeArray());
//





    }
}
