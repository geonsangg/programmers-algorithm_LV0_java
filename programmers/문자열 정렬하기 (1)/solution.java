// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/120850

class Solution {
    public int[] solution(String my_string) {
        String na = "";
		int temp = 0;
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) - 0 < 97 || my_string.charAt(i) - 0 > 122) {
				na += my_string.charAt(i);
			}
		}
		String[] nas = na.split("");
		int[] answer = new int[nas.length];
		for (int i = 0; i < nas.length; i++) {
			answer[i] = Integer.parseInt(nas[i]);
		}
		for (int a = 0; a < answer.length - 1; a++) {
			for (int b = a + 1; b < answer.length; b++) {
				if (answer[a] > answer[b]) {
					temp = answer[a];
					answer[a] = answer[b];
					answer[b] = temp;
				}
			}
		}
        return answer;
    }
}