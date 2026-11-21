import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int num : num_list) list.add(num);
        for (int i = n; i < num_list.length; i++){
            answer[i - n] = num_list[i];
        }
        for (int i = 0; i < n; i++){
            // answer[i + n - 1] = num_list[i]; 2, 2...3...4
            // answer[2] = num_list[0]
            // or
            // answer[2] = num_list[0]
            // answer[3] = num_list[1]
            // answer[4] = num_list[2]
            
            // num_list.length - n
            System.out.println(num_list.length - n + i);
            // answer[i] = num_list[i];
            answer[num_list.length - n + i] = num_list[i];
            

        }
        return answer;
    }
}