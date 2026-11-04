class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++){
            
            // int arr_min = -1;
            int arr_min = Integer.MAX_VALUE;
            
            for (int j = queries[i][0]; j <= queries[i][1]; j++){
                if (arr[j] > queries[i][2] && arr[j] < arr_min){
                    arr_min = arr[j];
                }
            }
            
            if (arr_min == Integer.MAX_VALUE) arr_min = -1;
            answer[i] = arr_min;
        }

        return answer;
    }
}