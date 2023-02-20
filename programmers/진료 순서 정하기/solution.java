// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120835

import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int [emergency.length];
        int[] answer2 = new int [emergency.length];
        for(int i=0; i<emergency.length; i++){
            answer2[i] = emergency[i];
        }
        Arrays.sort(answer2);
        for(int i=0; i<answer2.length; i++){
            for(int j=0; j<answer2.length; j++){
                if(emergency[i] == answer2[j]){
                    answer[i] = answer.length-j;
                }
            }
        }
        return answer;
    }
}