class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> arr = new HashMap<>();

        for(int i =0 ; i<nums.length; i++){
            arr.put(i,nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
        
            if(arr.containsValue(x)){
                final int k = i;
                int j = arr.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(x) && entry.getKey() != k)
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(-1);
                
                if(j!= -1){
                 return new int[]{Math.min(i,j), Math.max(i,j)};
                }

            }
        }

        return new int[]{};
    }
}
