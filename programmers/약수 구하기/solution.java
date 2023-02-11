// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120897

class Solution {
    public int[] solution(int n) {
       int[] array = new int [n];
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                array[count] = i;
                count++;
            }
        }
        int[] answer = new int [count];
        for(int i=0; i<answer.length; i++){
            answer[i] = array[i];
        }
        return answer;
    }
}