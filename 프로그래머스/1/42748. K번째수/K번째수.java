import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++){
            int startAt = commands[i][0];
            int endAt = commands[i][1];
            int point = commands[i][2];
            int length = endAt - startAt + 1;
            
            int[] arr = new int[endAt - startAt + 1];
            
            for (int j = startAt - 1; j < endAt; j++){
                arr[j - startAt + 1] = array[j];
            }
            
            Arrays.sort(arr);
            answer[i] = arr[point - 1];
        }
        
        return answer;
    }
}