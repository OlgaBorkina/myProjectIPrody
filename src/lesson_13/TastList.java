package lesson_13;

import java.util.*;

public class TastList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple", "banana", "apple", "cherry", "banana",
                "date", "fig", "grape", "apple", "cherry",
                "kiwi", "lemon", "mango", "banana", "nectarine",
                "orange", "peach", "apple", "banana", "cherry"
        );

        System.out.println(countOccurance(list, "cherry"));
        int[] arr = {1,2,3};
        System.out.println(toList(arr));
        List<Integer> listInt = new ArrayList<>(Arrays.asList(2,3,1,3,5,2,3,4,5,2,3,4,1,1));
        System.out.println(findUnique(listInt));
        calcOccurance(list);


    }

    public static int countOccurance(List<String> list, String target) {
        int count = 0;
        for(String str: list) {
            if(str.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int [] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> listResult = new ArrayList<>();
        for(Integer i: list){
            if(!listResult.contains(i)){
                listResult.add(i);
            }
        }
        return listResult;
    }
    public static void calcOccurance(List<String> strList) {
        Map<String,Integer> mapStr = new HashMap<>();
        for(String str: strList) {
            if(!mapStr.containsKey(str)){
                mapStr.put(str,1);
            }else{
                mapStr.put(str,mapStr.get(str)+1);
            }
        }
        System.out.println(mapStr.toString());
    }


}


