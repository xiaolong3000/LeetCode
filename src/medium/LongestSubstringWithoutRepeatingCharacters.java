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
       char[] r=s.toCharArray();
       int max=0;


        List<Character> list=new ArrayList<>();
        List<Character> list_remove=new ArrayList<>();
        for (int i=0;i<r.length;i++){
          if (list.contains(r[i])){
              max=max>=list.size()?max:list.size();
               for (int j=0;j<=i;j++){
                   list_remove.add(r[i]);
               }
               list.removeAll(list_remove);
              list_remove.clear();
          }
          list.add(r[i]);
        }



        System.out.println(max);



    }
}
