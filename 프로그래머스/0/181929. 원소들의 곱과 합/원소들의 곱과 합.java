class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_pow = 0;
        int x = 1;
        
        for (int i = 0; i < num_list.length; i++){
            x *= num_list[i];
            sum_pow += num_list[i];
        }
        
        sum_pow = (int) Math.pow(sum_pow, 2);
        
        return x < sum_pow ? (int)1 : (int)0;
    }
}