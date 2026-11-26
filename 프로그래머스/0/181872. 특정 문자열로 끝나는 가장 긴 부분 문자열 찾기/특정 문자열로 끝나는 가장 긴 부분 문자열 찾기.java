class Solution {
    public String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder(myString);
        while (true){
            if (!answer.toString().endsWith(pat)) {
                answer.deleteCharAt(answer.length() - 1);
                continue;
            }
            break;
        }
        return answer.toString();
    }
}