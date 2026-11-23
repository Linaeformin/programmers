class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int i = 0; i < queries.length; i++){
            int min = queries[i][0];
            int max = queries[i][1];
            
            for (int j = min; j <= max; j++){
                answer[j]++;
            }
        }
    
        return answer;
    }
}