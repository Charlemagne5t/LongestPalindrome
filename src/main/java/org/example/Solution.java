package org.example;

public class Solution {
    public int longestPalindrome(String s) {
        long mask = 0;
        int res  = 0;
        for(int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            mask ^= 1L << ch;
            if((mask & (1L << ch)) == 0){
                res += 2;
            }

        }
        if(mask != 0) {
            res++;
        }

        return res;
    }
}
