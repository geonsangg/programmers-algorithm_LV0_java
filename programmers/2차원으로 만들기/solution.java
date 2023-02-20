// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120842

class Solution {
    public int[][] solution(int[] num_list, int n) {
            int two = (num_list.length / n);
	        int[][] answer = new int [two][n];
	        int index = 0;
	        for(int i=0; i<two; i++){
	            for(int j=0; j<n; j++){
	                answer[i][j] = num_list[index];
	                index++;
	            }
	        }
            return answer;           
    } 
}