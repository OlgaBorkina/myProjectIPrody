package testAuto;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] afterLastFour(int[] arr){
        int indexLastFour = -1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 4){
                indexLastFour = i;
                break;
            }
        }
        if(indexLastFour == -1){
            throw new RuntimeException("No such last four");
        }
        return Arrays.copyOfRange(arr, indexLastFour + 1, arr.length);

    }

    public static boolean searchOnlyOneAndFour(int[] arr){
        boolean one = false;
        boolean four = false;

        for(int i: arr){
            if(i == 1){
                one = true;
            }else if(i == 4){
                four = true;
            }else{
                return false;
            }
        }
        return one && four;
    }
}

