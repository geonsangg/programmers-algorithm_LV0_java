// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120845

class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}