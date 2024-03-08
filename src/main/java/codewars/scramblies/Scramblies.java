package scramblies;

import java.util.HashMap;
import java.util.Map;


// public class Scramblies {
//     public static void main(String[] args) {

//         String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
//         String s2 = "zyxcba".repeat(9_000);
//         scramble(s1, s2);
//     }
//     // public static boolean scramble(String str1, String str2) {

//     //     char[] str2CharArray = str2.toCharArray();
//     //     boolean stringMatch = false;

//     //     HashMap<Integer,Character> mapStr1 = new HashMap<>();

//     //     for (int i = 0; i < str1.toCharArray().length; i++) {
           
//     //         mapStr1.put(i, str1.toCharArray()[i]);
//     //     }

//     //     for (char str2Char : str2CharArray) {
//     //         stringMatch = false;
//     //         for (Map.Entry<Integer, Character> entry : mapStr1.entrySet()) {
                
//     //             if (entry.getValue().equals(str2Char)){

//     //                 mapStr1.remove(entry.getKey());
//     //                 stringMatch = true;
//     //                 break;
//     //             }
//     //         }

//     //         if (!stringMatch){

//     //             return stringMatch;
//     //         }

//     //     }

//     //     return stringMatch;
//     // }

// } 


public class Scramblies {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
        String s2 = "zyxcba".repeat(9_000);
        // String s1 = "scriptsjava";
        // String s2 = "javascripts";
        System.out.println(scramble(s1, s2));
    }

    public static boolean scramble(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            int count = charCountMap.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            charCountMap.put(c, count - 1);
        }

        return true;
    }
}

