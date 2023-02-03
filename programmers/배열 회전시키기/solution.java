// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120844

class Solution {
    public int[] solution(int[] numbers, String direction) {
           int[] answer = new int [numbers.length];
        String str = "right";
        for(int i=0; i<numbers.length-1; i++){
            if(direction.equals(str)){
                answer[0] = numbers[numbers.length-1];
                answer[i+1] = numbers[i];
            }
            else{
                answer[numbers.length-1] = numbers[0];
                answer[i] = numbers[i+1];   
        }
        }
        return answer;
    }
}