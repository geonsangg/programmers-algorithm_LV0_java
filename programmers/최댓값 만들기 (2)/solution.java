// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120862

class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i]*numbers[j]>answer){
                    answer=numbers[i]*numbers[j];
                }
            }
        }
        return answer;
    }
}