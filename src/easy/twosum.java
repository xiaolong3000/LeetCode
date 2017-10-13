package easy;

import java.util.*;

/*question:
*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

* */
public class twosum {
    public static void main(String[] args) {
        int[] nums={3,2,3};
      Map<Integer,Integer> map=new HashMap<>();
        int target=6;
        int[] result=new int[2];
        for (int i=0;i<nums.length;i++){
              if (map.get(nums[i])==null){
                  map.put(target-nums[i],i);
              }else{
                  result=new int[]{map.get(nums[i]),i};
              }

        }
        System.out.println(result[0]+"     "+result[1]);//return result;




        //return back





    }
}

/*
* 假设数组为2 7 11 15， target 为9, 则用9减数组的元素得到一个新的数组7 2 -2 -6，则只需要查找数组中的元素是否在新的数组中出现即可判断是否存在满足条件的两个数。

比如2和7 在新的数组中也存在，所以2和7即满足条件。

题目要求找到满足条件的索引，只需要用一个map，key为target-a[i]，value为index。当遍历数组a[i]，若a[i]在map keyset中，则说明i和map[a[i]]即是解。

在java中map的get方法获取不到值时返回null，源码如此
*
* */
