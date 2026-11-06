import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] nums = {a, b, c, d};

        System.out.println(nums);
        
        Arrays.sort(nums);

        a = nums[0];
        b = nums[1];
        c = nums[2];
        d = nums[3];
        
        if (a == d) answer = 1111 * a;
        else if (a == c) answer = (10 * a + d) * (10 * a + d);
        else if (a == b) {
            if (c == d) answer = (a + c) * (c - a);
            else answer = c * d;
        }
        // a와 나머지는 일단 다름
        else if (b == d) answer = (10 * b + a) * (10 * b + a);
        else if (b == c) answer = a * d;
        else if (c == d) answer = a * b;
        else answer = a;
        
        return answer;
    }
}