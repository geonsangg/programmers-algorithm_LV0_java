// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120906

class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        String[] nums = num.split("");
        for(int i=0; i<nums.length; i++){
            answer += Integer.parseInt(nums[i]);
        }
        return answer;
    }
}