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
    * set的tostring源码：看着就蛋疼，还不如自己写一下
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
    * 
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
        String s="babad";
//似乎理解错题目了，如果按照上一题的解法，不可能出现bab的


        Set<Character> set = new HashSet<>();
        int max = 0;
        int index = 0;
        int left = 0;
        String result="";
        while (index < s.length()) {
            System.out.println(set.toString());
            if (set.add(s.charAt(index))) {
               // max = Math.max(max, ++index - left);
                int now=++index-left;

                if (max<now){
                    max=now;

                    result=getstring(set);

                    System.out.println(max);
                }
            } else {
                set.remove(s.charAt(left++));

            }

        }
        System.out.println(result);
    }
}
