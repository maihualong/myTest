package Otc;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1){
            return 0;
        }
        int res = 0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
