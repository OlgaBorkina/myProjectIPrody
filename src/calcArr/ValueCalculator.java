package calcArr;

import java.util.Arrays;

public class ValueCalculator {
    private float[] array;
    private final int size;

    public ValueCalculator(int size) {
        if(size<1_000_000){
            throw new IllegalArgumentException("Size must be - 1 000 000");
        }
        this.size = size;
        array = new float[size];
    }

    public float[] getArray() {
        return array;
    }

    public  void fillArray(){
        Arrays.fill(array,1.0f);
    }

    public void doCalc(){
        long timeStart = System.currentTimeMillis();
        fillArray();
        int half = size / 2;
        float [] firstArr = new float[half];
        float [] secondArr = new float[half];

//        System.arraycopy(array, 0, firstArr, 0, half);
//        System.arraycopy(array, half, secondArr, 0, half);
//
//        Thread thread1 = new Thread(() -> {
//            for(int i=0; i < firstArr.length; i++){
//                firstArr[i] =(float)(firstArr[i]* Math.sin(0.2f + i/5.0) *
//                                                    Math.cos(0.2f+i/5.0)*
//                                                    Math.cos(0.4f+i/2.0));
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            for(int i=0; i < secondArr.length; i++){
//                int ind = i+ half;
//                secondArr[i] =(float)(secondArr[i]* Math.sin(0.2f + ind/5.0) *
//                                                    Math.cos(0.2f+ind/5.0)*
//                                                    Math.cos(0.4f+ind/2.0));
//            }
//        });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < size / 2; i++) {
                array[i] = (float) (array[i] * Math.sin(0.2f + i / 5.0)
                        * Math.cos(0.2f + i / 5.0)
                        * Math.cos(0.4f + i / 2.0));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = size / 2; i < size; i++) {
                array[i] = (float) (array[i] * Math.sin(0.2f + i / 5.0)
                        * Math.cos(0.2f + i / 5.0)
                        * Math.cos(0.4f + i / 2.0));
            }
        });

        thread1.start();
        thread2.start();



        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        System.arraycopy(firstArr,0,array,0,half);
//        System.arraycopy(secondArr,0,array,half,half);

        long timeEnd = System.currentTimeMillis();
        System.out.println("Time taken: " + (timeEnd - timeStart));

    }

}
