package calcArr;

public class Main {
    public static void main(String[] args) {
        ValueCalculator valCalc = new ValueCalculator(1000000);
        valCalc.doCalc();
        float [] arr = valCalc.getArray();
        for(int i=0;i<15;i++){
            System.out.println(arr[i]);
        }
    }
}
