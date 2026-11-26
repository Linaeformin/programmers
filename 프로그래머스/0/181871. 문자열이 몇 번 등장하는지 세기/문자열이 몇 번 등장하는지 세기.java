class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLength = pat.length();

        for (int i = 0; i <= myString.length() - patLength; i++) {
            String part = myString.substring(i, i + patLength);

            if (part.equals(pat)) {
                answer++;
            }
        }

        return answer;
    }
}