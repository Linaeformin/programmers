class Solution {
    public int solution(String number) {
        // 각 자리 숫자의 합을 9로 나눈 나머지
        char[] array = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += (int) array[i] - '0';
        }
        int answer = sum % 9;
        return answer;
    }
}