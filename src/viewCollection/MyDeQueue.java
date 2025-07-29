package viewCollection;

import java.util.Arrays;

public class MyDeQueue {
    private int[] array;
    private int head;
    private int tail;
    private int size;
    private final int sizeArray = 5;


    public MyDeQueue() {
        array = new int[sizeArray];
        this.head = 0;
        this.tail = 0;
        this.size = 0;

    }
    public void addToBegin(int value) {
        if (size == array.length) {
            throw new RuntimeException("Is FULL");
        }
        array[head] = value;
        head = (head + 1) % array.length;

        size++;
        System.out.println("Head " +head);
        System.out.println("Tail " +tail);
    }

    public void addToEnd(int value) {
        if (size == array.length) {
            throw new RuntimeException("Is FULL");
        }
        array[tail] = value;
        tail = (tail + 1) % array.length;

        size++;
        System.out.println("Head " +head);
        System.out.println("Tail " +tail);
    }




    public int  getFromBegin(){
        if(size ==0){
            throw new  RuntimeException("Is EMPTY");
        }
        System.out.println(head);
        System.out.println(tail);
        int temp = array[head];
        array[head] = 0;
        head= (head+1)% array.length;
        size--;

        return temp;
    }

    public int  getFromEnd(){
        if(size ==0){
            throw new  RuntimeException("Is EMPTY");
        }
        System.out.println("getFromEnd  Head " + head);
        System.out.println("getFromEnd Tail " +tail);
        int temp = array[tail];
        tail= (tail+1)% array.length;
        size--;
        return temp;
    }

    public int sizeArray(){
        return size;
    }



    @Override
    public String toString() {
        return Arrays.toString(array) ;
    }
}
