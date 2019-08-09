package com.CK;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        String s = "PAYPALISHIRING";
        String s = "PAYPALISHIRING";
//        String s = "ABC";
//        String s = "ABCDE";
        Solution solution = new Solution();
        System.out.println(solution.convert(s, 4));
    }
}

class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 0) return "";
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder sb = new StringBuilder(s);
        List<StringBuilder> sbList = new ArrayList<>();
        int i;
        while (true) {
            for (i = 0; i < numRows; i++) {
                if (sbList.size() < numRows) sbList.add(new StringBuilder());
                if (sb.length() == 0) break;
                sbList.get(i).append(sb.charAt(0));
                sb.deleteCharAt(0);
            }
            i--;
            while (i > 1) {
                i--;
                if (sb.length() == 0) break;
                sbList.get(i).append(sb.charAt(0));
                sb.deleteCharAt(0);
            }
            if (sb.length() == 0) break;
        }

        StringBuilder res = new StringBuilder();
        for (i = 0; i < numRows; i++) {
            res.append(sbList.get(i));
        }
        return res.toString();
    }
}