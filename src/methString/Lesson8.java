package methString;

import org.w3c.dom.ls.LSOutput;

public class Lesson8 {

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("AbraKadabra", 'a'));
        System.out.println(findWordPosition("Apollon", "p"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrom(""));
    }

    public static int findWordPosition(String source,String target){
        if(target.length()>source.length()){
            return -1;
        }
        char[] letSource = source.toCharArray();
        char[] letTarget = target.toCharArray();
        int index =-1;
        for(int i = 0 , k = 0; i < letSource.length-letTarget.length+1 ; i++){
            if(letSource[i] == letTarget[k]){
                index = i;
                if(letTarget.length == 1){
                    break;
                }
                for(int j = i+1 , l = k+1; l < letTarget.length ;j++, l++ ){
                    if(letSource[j] != letTarget[l]){
                        index = -1;
                        break;
                    }
                }
            }
        }
        return index;
    }

    public static boolean isPalindrom(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    public static String  stringReverse(String str) {
        if(str.length() == 0){    //or use method .isEmpty()
            System.out.println("String is empty");
        }
        char [] ch = str.toCharArray();
        StringBuilder strBuild = new StringBuilder();
        for(int i = ch.length - 1; i >= 0; i--) {
            char temp = ch[i];
            strBuild.append(temp);
        }
        return strBuild.toString();

    }



    public static int findSymbolOccurance(String str, char ch) {
        int count = 0;
        if (!str.isEmpty()) {
            str = str.toLowerCase();
            char[] letters = str.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == ch) {
                    count++;
                }
            }
        }
        return count != 0 ? count : -1;

    }
}
