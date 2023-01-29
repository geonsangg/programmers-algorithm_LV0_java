// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120837

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int king = hp / 5;
        int ant = (hp%5) / 3;
        int work = hp - (king*5 + ant*3);
        answer = king + ant + work;
        return answer;
    }
}