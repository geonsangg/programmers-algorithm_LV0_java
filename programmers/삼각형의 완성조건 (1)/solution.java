// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120889

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int num = 0;
        int sum = 0;
       for(int i=0; i<sides.length; i++){
           sum += sides[i];
               if(num < sides[i])
                   num = sides[i];
       } if(sum - num <= num){
           answer = 2;
       } else{
           answer = 1;
       }
        return answer;
    }
}