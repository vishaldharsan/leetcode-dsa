class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int max = 0;
        while(s<e){
            int wid = e - s;
            int min = Math.min(height[s],height[e]);
            int cap = wid*min;
            max = Math.max(max,cap);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return max;
    }
}