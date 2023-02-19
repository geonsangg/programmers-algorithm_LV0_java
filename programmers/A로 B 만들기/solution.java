// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120886

import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] str = before.split("");
        String[] str2 = after.split("");
        Arrays.sort(str);
        Arrays.sort(str2);
        if(Arrays.equals(str,str2)){
            answer = 1;
        }
        return answer;
    }
}