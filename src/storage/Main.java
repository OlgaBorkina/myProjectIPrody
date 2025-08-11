package storage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] number = {1,23,54,6,7};
        changePlace(number);
        String [] word ={"A","B","C","D","E","F","G","H"};
        changePlace(word);
        System.out.println(transform(number).toString());



    }

    public static <T> void changePlace(T [] arr){
        if(arr== null || arr.length == 0 ){
            return;
        }
        for (int i = 0; i < arr.length-1; i+=2) {
          T temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static <T> List<T> transform( T[] arr){
        List<T> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}
