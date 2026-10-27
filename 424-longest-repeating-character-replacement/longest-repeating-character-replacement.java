
class Solution {
    public int characterReplacement(String s, int k) {
        int []freq = new int[26];
        int max = 0;
        int maxfre = 0,left =0;
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'A';
            freq[index]++;
            maxfre = Math.max(maxfre,freq[index]);
            while((i-left+1)-maxfre>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
