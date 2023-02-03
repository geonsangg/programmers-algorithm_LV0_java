// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120905

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] array = new int [numlist.length];        
        int index=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                array[index] = numlist[i];
                    index++;
            }
        }
        int[] answer = new int [index];
        for(int j=0; j<index; j++){
            answer[j] = array[j];
        }
        return answer;
    }
}