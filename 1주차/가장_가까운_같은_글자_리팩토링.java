# https://school.programmers.co.kr/learn/courses/30/lessons/142086?language=java

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (charIndexMap.containsKey(currentChar)) {
                answer[i] = i - charIndexMap.get(currentChar);
            } else {
                answer[i] = -1;
            }
            charIndexMap.put(currentChar, i);
        }
        
        return answer;
    }
}
