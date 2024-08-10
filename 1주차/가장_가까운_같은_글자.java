# https://school.programmers.co.kr/learn/courses/30/lessons/142086?language=java

class Solution {
    public int[] solution(String s) {
        char[] chars = s.toCharArray();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char aChar = chars[i];
            boolean flag = false;
            int index = 0;
            for (int j = 0; j < i; j++) {
                if (chars[j] == aChar) {
                    flag = true;
                    index = j;
                }
            }
            if (flag) {
                answer[i] = i - index;
            } else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}
