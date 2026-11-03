class Solution {
    public int solution(int[] num_list) {
        int sum_pow = 0;
        int x = 1;
        
        for (int i = 0; i < num_list.length; i++){
            x *= num_list[i];
            sum_pow += num_list[i];
        }
        
        sum_pow = (int) Math.pow(sum_pow, 2);
        
        return x < sum_pow ? 1 : 0;
    }
}