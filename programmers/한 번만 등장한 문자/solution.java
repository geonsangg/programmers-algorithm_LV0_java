// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120896

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int temp = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    temp++;
                }
            }
              if(temp == 1){
                  answer += arr[i];
              } 
            }
        return answer;
    }
}