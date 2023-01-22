// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120847

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int result = 0;
        for(int i=0; i<numbers.length -1; i++){
            for(int j=i+1; j<numbers.length; j++) {
                result = numbers[i] * numbers[j];
                if(answer < result){
                    answer = result;
                }
                }
        }
        return answer;
    }
}