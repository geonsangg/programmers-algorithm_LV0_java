// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120887

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        for(int a=i; a<=j; a++){
            str += a;
        }
        for(int b=0; b<str.length(); b++){
            if(k == str.charAt(b)-'0'){
                answer++;
            }
        }
        return answer;
    }
}