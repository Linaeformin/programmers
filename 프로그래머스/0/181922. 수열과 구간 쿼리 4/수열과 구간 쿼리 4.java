class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++){
            int min = queries[i][0];
            int max = queries[i][1];
            int k = queries[i][2];
            
            for (int j = min; j <= max; j++){
                if (j % k == 0) arr[j]++;
            }
        }
        return arr;
    }
}