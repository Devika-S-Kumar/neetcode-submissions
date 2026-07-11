class Solution {
    public int majorityElement(int[] nums) {

        Map <Integer, Integer> ans = new HashMap<>();

        for(int i : nums){
            ans.putIfAbsent(i,1);
            if(ans.containsKey(i)){
                ans.put(i, ans.get(i) + 1);
            }
        }
        
        int max = 0;
        int value = 0;

        for(Map.Entry<Integer, Integer> entry : ans.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                value = entry.getKey();
            }
        }

        return value;
    }
}