import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] sourse = new int[]{1,2,7,8,9,4,6};
        int [] target = new int[]{4,9,8,3};
        System.out.println("Sourse  " + Arrays.toString(sourse));
        System.out.println("Target  " + Arrays.toString(target));
        arrayCopy(sourse,target);
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
