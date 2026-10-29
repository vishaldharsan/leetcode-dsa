import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) {
            return result;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        // Count characters in p and the first window of s
        for (int i = 0; i < p.length(); i++) {
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i) - 'a']++;
        }
        // Check the first window
        if (match(freq1, freq2)) {
            result.add(0);
        }
        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {
            // Add the incoming character
            freq2[s.charAt(i) - 'a']++;
            // Remove the outgoing character
            freq2[s.charAt(i - p.length()) - 'a']--;
            // Check the current window
            if (match(freq1, freq2)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;
    }
    private boolean match(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
}