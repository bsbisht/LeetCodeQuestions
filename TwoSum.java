// Two Sum 
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] result = new int[2];  
     Map<Integer,Integer> map = new HashMap<>(); 
       
     for(int i = 0 ; i < nums.length ; i++)
     {
         int find = target - nums[i];
         Integer foundInMap = map.get(find);
         if(foundInMap != null && foundInMap != i)
         {
             result[0] = i;
             result[1] = foundInMap;
             return result;
         }else
         {
             map.put(nums[i],i);
         }       
    }
    return result;
    }
}
 
