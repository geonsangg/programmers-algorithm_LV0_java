// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120910

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        for(int i=1; i<=t; i++){
            n = n*2;
        }
        answer = n;
        return answer;
    }
}