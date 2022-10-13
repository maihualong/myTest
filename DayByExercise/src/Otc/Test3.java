package Otc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 滑动窗口
 * leetcode  2022/10/12
 *187. 重复的DNA序列
 */
public class Test3 {
    public static void main(String[] args) {

    }
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() < 11){
            return list;
        }

        int right = 10;
        HashMap<String, Integer> map = new HashMap<>();
        while(right <= s.length()){
            String s1 = s.substring(right - 10, right);
            if (map.containsKey(s1)){
                map.put(s1, map.get(s1) + 1);
            }else {
                map.put(s1, 1);
            }
            right++;
        }
        for (String s2 : map.keySet()){
            if (map.get(s2) >= 2){
                list.add(s2);
            }
        }
        return list;
    }
}
