// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120849

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) != 'a' && my_string.charAt(i) != 'e' && my_string.charAt(i) != 'i' &&
              my_string.charAt(i) != 'o' && my_string.charAt(i) != 'u' )
        answer += my_string.charAt(i);
        }
        return answer;
    }
}