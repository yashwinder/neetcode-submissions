
class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length<2){
            return false;
        }
        
        Set<Integer> seenElements = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(seenElements.contains(nums[i]))
                return true;
            seenElements.add(nums[i]);
        }
        return false;
    }
}