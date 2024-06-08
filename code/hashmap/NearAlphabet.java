import java.util.*;

class NearAlphabet {
    /*
     * 가장 가까운 글자
     * https://school.programmers.co.kr/learn/courses/30/lessons/142086 
     */
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                Integer nearIndex = map.get(c);
                answer[i] = i - nearIndex;
            } else {
                answer[i] = -1;
            }
            map.put(c, i);
        }
        
        return answer;
    }
}