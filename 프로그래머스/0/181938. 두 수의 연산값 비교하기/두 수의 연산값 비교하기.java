class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = String.valueOf(a);
        String num2 = String.valueOf(b);
        String c = num1 + num2;
        answer = Integer.parseInt(c);
        
        if (answer < 2 * a * b) return 2 * a * b;
        return answer;
    }
}