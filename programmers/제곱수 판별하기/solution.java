// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120909

class Solution {
    public int solution(int n) {
        int answer = 2;
        for(int i=0; i<n; i++){
            if(i*i == n){
                answer = 1;
            } 
        }
        return answer;
    }
}