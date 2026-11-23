class Solution {
    public int solution(int[] num_list) {
        int hol = 0;
        int jak = 0;
        
        for (int i = 0; i < num_list.length; i++){
            if (i % 2 == 0) hol += num_list[i];
            else jak += num_list[i];
        }
        
        return Math.max(hol, jak);
    }
}