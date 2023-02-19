// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120888

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String result = "";
		String[] nums = my_string.split("");
		for (int i=nums.length-1; i >=0; i--) {
			int temp = 0;
			for(int j=i-1; j>=0; j--) {
				if(nums[i].equals(nums[j])) {
					temp++;
					}
				}
			if(temp == 0) {
				result += nums[i];
					
				}
			}
		
			for(int i=result.length()-1; i>=0; i--) {
				answer += result.charAt(i);
			}
        return answer;
    }
}