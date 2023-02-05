// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120895

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String temp;
        String[] list = my_string.split("");
        temp = list[num1];
        list[num1] = list[num2];
        list[num2] = temp;
        for(int i=0; i<list.length; i++){
            answer += list[i];
        }
        return answer;
    }
}