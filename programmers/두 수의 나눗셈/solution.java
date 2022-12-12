// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120806

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double x = (double) num1 / num2;
        answer = (int) (x * 1000);
        return answer;
    }
}