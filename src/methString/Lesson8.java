package methString;

import org.w3c.dom.ls.LSOutput;

public class Lesson8 {

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("AbraKadabra", 'a'));
        System.out.println(findWordPosition("Apollon", "p"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrom("Ara"));
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
                if(letTarget.length == 1){ // check if we were given one single character in a line
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
        int size = str.length();
        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) != str.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String  stringReverse(String str){
        char[] chars = str.toCharArray();
        char[] reversedChars = new char[chars.length];
        for(int i = 0 ; i< chars.length ; i++){
            reversedChars[reversedChars.length-1-i] = chars[i];
        }
        String  strRevers = new String(reversedChars);
        return strRevers;
    }



    public static int findSymbolOccurance(String str, char ch) {
        int count = 0;
        if (!str.isEmpty()) {
            char[] letters = str.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == ch) {
                    count++;
                }
            }
        }
        return count;

    }
}