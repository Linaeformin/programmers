class Solution {
    public int solution(int[] num_list) {
        int hap = 0;
        int gob = 1;
        if (num_list.length >= 11){
            for (int num : num_list) hap += num;
            return hap;
        } else {
            for (int num : num_list) gob *= num;
            return gob;
        }
    }
}