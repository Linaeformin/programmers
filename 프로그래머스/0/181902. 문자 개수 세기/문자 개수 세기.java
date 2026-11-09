class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++){
            int ch = (int) my_string.charAt(i);
            
            if (Character.isUpperCase(my_string.charAt(i))) answer[ch - 'A'] += 1;
            else answer[ch - 'a' + 26] += 1;
        }

        return answer;
    }
}