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

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="abcabcbb";
       char[] r=s.toCharArray();//这种方法超级慢
       int max=0;
        List<Character> list=new ArrayList<>();
       for (char c:r){

          if (!list.contains(c)){
              list.add(c);
          }else {
              for (int i=0;i<list.size();i++){
                         if (list.get(i).equals(c)){
                             for (int j=i;j>=0;j--){
                                 list.remove(j);
                             }
                         }
              }
              list.add(c);
          }
           max=(max>list.size())?max:list.size();
       }
        System.out.println(max);
    }
}
