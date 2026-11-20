import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {

        int min = -1;
        int max = -1;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 2) {
                min = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--){
            if (arr[i] == 2) {
                max = i;
                break;
            }
        }
        
        if (min == -1){
            int[] answer = {-1};
            return answer;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = min; i <= max; i++){
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}