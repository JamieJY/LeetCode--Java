class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> numberMap = new HashMap<>();
      int n =nums.length;
     //build hashMap
      for(int i = 0; i < n; i++){
          numberMap.put(nums[i],i);
      }

      for(int i = 0; i < n; i++){
          int complement = target - nums[i];
          // [2,7,11,15] target = 9 i=0, nums[0] = 2, complement = 7; 
          if(numberMap.containsKey(complement) && numberMap.get(complement) != i){
              //true first index i,complement index 
              return new int[] {i,numberMap.get(complement)};
             
          }
      }
       return null; 
}
}