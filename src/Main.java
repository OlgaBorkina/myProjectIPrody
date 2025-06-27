import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] sourse = new int[]{1,2,7,8,9,4,6};
        int [] target = new int[]{4,9,8,3};
        System.out.println("Sourse  " + Arrays.toString(sourse));
        System.out.println("Target  " + Arrays.toString(target));
        arrayCopy(sourse,target);

        int [] array = new int []{7,5,9,3,8,32,11,6,65};
        System.out.println( "Start  "+ Arrays.toString(array));
        shakerSort(array);
    }

    public static  void shakerSort(int[] arr){
        boolean flagLeft = true;
        boolean flagRight = true;

       while (flagLeft || flagRight){
           flagLeft = false;
           flagRight = false;

           moveToRight(arr,flagRight);
           moveToLeft(arr,flagLeft);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveToRight(int [] arr, boolean flagLeft){
        for (int i = 1 ; i < arr.length; i++){
            if(arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                flagLeft = true;
            }
        }
    }

    public static void moveToLeft(int [] arr, boolean flagRigth){
        for (int j = arr.length-1; 0 < j ; j--) {
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                flagRigth = true;
            }
        }
    }

    public static void arrayCopy (int[] sourse, int[] target) {
        int[] result = new int[sourse.length + target.length];
        int i;
        for (i = 0; i < target.length; i++) {
            result[i] = target[i];
        }

        for (int k = 0; k < sourse.length; k++) {
            result[i++] = sourse[k];
        }
        System.out.println( "Result method arrayCopy  "+ Arrays.toString(result));
    }
}
