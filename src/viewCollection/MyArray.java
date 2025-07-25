package viewCollection;

public class MyArray {
    private int[] array;
    private int size;


    public MyArray() {
        this.array = new int[15];
        this.size = 0;
    }

    public void addValue(int value) {
        if (size == array.length) {
            resizeArray();
        }
         array[size] = value;
        size++;
    }

   public int getFromArray(int index){
        return array[index];
   }

   public int size(){
        return size;
   }

   private void resizeArray() {
        int newSize =(int) (array.length * 1.5+1);
       int[] newArray = new int[newSize];
       System.arraycopy(array, 0, newArray, 0, array.length);
       array = newArray;
   }

}
