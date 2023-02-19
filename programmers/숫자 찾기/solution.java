// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120904

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String nums = Integer.toString(num);
        String[] list = nums.split("");
        for(int i=0; i<list.length; i++){
            if(Integer.parseInt(list[i]) == k){
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}