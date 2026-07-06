class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i: nums){
            ans.add(i);
        }
        if(nums.length == ans.size())
        {
            return false;
        }
        return true;
        
    }
}