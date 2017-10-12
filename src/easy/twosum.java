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
