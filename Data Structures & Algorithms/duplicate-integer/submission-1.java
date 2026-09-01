
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Guard clause: null or arrays with fewer than 2 elements cannot contain duplicates
        if (nums == null || nums.length < 2) {
            return false;
        }

        // Pre-size the set capacity based on array length to prevent internal array re-hashes
        Set<Integer> seenElements = new HashSet<>(nums.length);

        for (int num : nums) {
            // Set.add() returns false if the element already exists
            if (!seenElements.add(num)) {
                return true;
            }
        }

        return false;
    }
}