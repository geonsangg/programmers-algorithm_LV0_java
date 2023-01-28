// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120851

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] num = my_string.split("");
        for(int i=0; i<num.length; i++){
            for(int j=1; j<10; j++){
               try{
                if(j==Integer.parseInt(num[i])){
                    answer += Integer.parseInt(num[i]);
                }
               }catch(NumberFormatException e) {
                   
               }
            }
        }
        return answer;
    }
}