// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120854

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}