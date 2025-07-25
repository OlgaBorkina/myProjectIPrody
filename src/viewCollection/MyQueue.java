package viewCollection;

import java.util.Arrays;

public class MyQueue {
    private int[] array;
    private int head;
    private int tail;
    private int size;
    private final int sizeArray = 3;


    public MyQueue() {
        array = new int[sizeArray];
        this.head = 0;
        this.tail = 0;
        this.size = 0;

    }

    public void addInLine(int value) {
           if (size == array.length) {
                throw new RuntimeException("Is FULL");
            }

            array[tail] = value;
            tail = (tail + 1) % array.length;
            size++;
        }


    public int  getFromLine(){
        if(size ==0){
            throw new  RuntimeException("Is EMPTY");
        }
        int temp = array[head];
        array[head] = 0;
        head= (head+1)% array.length;
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
