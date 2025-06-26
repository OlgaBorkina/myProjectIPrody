import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] sourse = new int[]{1,2,7,8,9,4,6};
        int [] target = new int[]{4,9,8,3};
        System.out.println("Sourse  " + Arrays.toString(sourse));
        System.out.println("Target  " + Arrays.toString(target));
        arrayCopy(sourse,target);

        int [] array = new int []{78,5,9,14,7,3,11,0,7,4};
        shakerSort(array);
    }

    public static  void shakerSort(int[] arr){
        System.out.println( "Start  "+ Arrays.toString(arr));
       boolean flagLeft = true;
       boolean flagRight = true;

       while (flagLeft || flagRight){
           flagLeft = false;
           flagRight = false;
          for (int i = 1 ; i < arr.length; i++){

            if(arr[i]<arr[i-1]){
               int temp = arr[i];
               arr[i] = arr[i-1];
               arr[i-1] = temp;
               flagLeft = true;
            }
        }
            for (int j = arr.length-1; 0 < j ; j--) {

                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flagLeft = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
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
