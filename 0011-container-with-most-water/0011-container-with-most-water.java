class Solution {
    public int maxArea(int[] height) {
        int lef = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (lef < right) {
            int width = right - lef;
            int minHeight = Math.min(height[lef], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

           
            if (height[lef] < height[right]) {
                lef++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}