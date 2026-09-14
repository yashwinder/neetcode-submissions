class Solution {
    public int maxArea(int[] heights) {
        if(heights.length<2){
            return 0;
        }
        int left = 0, right=heights.length-1;
        int maxWater = 0;
        while(left<right){
            int leftVal = heights[left];
            int rightVal = heights[right];
            int width = (right-left);
            int currWater = Math.min(leftVal,rightVal) * width;
            if(currWater>maxWater){
                maxWater = currWater;
            }
            if(leftVal<=rightVal){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
