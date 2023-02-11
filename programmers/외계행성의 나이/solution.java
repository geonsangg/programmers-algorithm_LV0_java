// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120834

class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        String[] ages = str.split("");
        for(int i=0; i<ages.length; i++){
            answer += (char)(Integer.parseInt(ages[i]) + 97);
        }
        return answer;
    }
}