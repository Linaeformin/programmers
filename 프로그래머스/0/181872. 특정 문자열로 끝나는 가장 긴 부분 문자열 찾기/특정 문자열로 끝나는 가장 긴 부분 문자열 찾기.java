class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder(myString);

        while (!answer.toString().endsWith(pat)) {
            answer.deleteCharAt(answer.length() - 1);
        }

        return answer.toString();
    }
}