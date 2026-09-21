class Solution {
    public int maxArea(int[] height) {
        int s = 0, e = height.length-1,c = height.length-1;
        int max = 0;
        while(s<e){
            int cap=0;
            if(height[s]<height[e]){
                cap = height[s]*c;
                s++;
                c--;
            }else{
                cap = height[e]*c;
                e--;
                c--;
            }
            max = Math.max(cap,max);
        }
        return max;
    }
}