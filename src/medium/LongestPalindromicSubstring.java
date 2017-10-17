package medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

Example:

Input: "cbbd"

Output: "bb"

*
* */
//读题困难啊,似乎是上一题的变种，上一题只需要求出长度就行了，这一题需要输出那个最长的字符串
public class LongestPalindromicSubstring {
    /*
    * set的tostring源码：
    *  public String  [More ...] toString() {
        Iterator<E> i = iterator();
        if (! i.hasNext())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = i.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! i.hasNext())
                return sb.append(']').toString();
            sb.append(", ");
        }
    }
}
    * 看着就蛋疼，还不如自己写一下
    *
    * */
    public static String getstring(Set<Character> set){
        StringBuilder sb=new StringBuilder();
        Iterator<Character> iterator=set.iterator();
        while(iterator.hasNext()){
            sb.append(iterator.next());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="pwwkew";


        if ((null == s) || (s.length() == 0)) {
            // return 0;
        }
        else if (s.length() == 1) {
            //   return 1;
        }

        Set<Character> set = new HashSet<>();
        int max = 0;
        int index = 0;
        int left = 0;
        String result="";
        while (index < s.length()) {
            if (set.add(s.charAt(index))) {
               // max = Math.max(max, ++index - left);
                int now=++index-left;
                if (max<=now){

                    result=getstring(set);
                    max=now;
                }
            } else {
                set.remove(s.charAt(left++));
            }

        }
        System.out.println(result);
    }
}
