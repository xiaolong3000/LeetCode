package medium;
/*
* Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*
*
* */

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="pwwkew";


        if ((null == s) || (s.length() == 0)) {
           // return 0;
        }
        else if (s.length() == 1) {
         //   return 1;
        }
        //好厉害啊，看其他人的答案Runtime: 49 ms
        Set<Character> set = new HashSet<>();
        int max = 0;
        int index = 0;
        int left = 0;
        while (index < s.length()) {
            if (set.add(s.charAt(index))) {
                max = Math.max(max, ++index - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }









        //较慢
//       char[] r=s.toCharArray();
//
//       List<Character> list=new ArrayList<>();
//       for (char c:r){
//           for (int i=0;i<list.size();i++){
//               if (list.get(i).equals(c)){
//                   for (int j=i;j>=0;j--){
//                       list.remove(j);
//                   }
//               }
//           }
//           list.add(c);
//
//           max=(max>list.size())?max:list.size();
//       }
//

        System.out.println(max);



    }


    /*
    *  List<Character> list=new ArrayList<>();
 +       for (char c:r){
 +
 +          if (!list.contains(c)){
 +              list.add(c);
 +          }else {
 +              for (int i=0;i<list.size();i++){
 +                         if (list.get(i).equals(c)){
 +                             for (int j=i;j>=0;j--){
 +                                 list.remove(j);
 +                             }
 +                         }
 +              }
 +              list.add(c);
 +          }
 +           max=(max>list.size())?max:list.size();
 +       }
 +        System.out.println(max);
    *
    *
    * */
}
