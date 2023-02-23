// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120885

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int a = Integer.parseInt(bin1,2);
        int b = Integer.parseInt(bin2,2);
        answer = Integer.toBinaryString(a+b);
        return answer;
    }
}