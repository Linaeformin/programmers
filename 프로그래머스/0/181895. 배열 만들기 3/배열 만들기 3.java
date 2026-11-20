import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = intervals[0][0]; i <= intervals[0][1]; i++){
            a.add(arr[i]);
        }
        for (int i = intervals[1][0]; i <= intervals[1][1]; i++){
            a.add(arr[i]);
        }
        
        int[] answer = new int[a.size()];
        
        for (int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}