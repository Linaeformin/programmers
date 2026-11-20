import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch(n){
            case 1:
                return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            case 2:
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            case 4:
                ArrayList<Integer> a = new ArrayList<>();
                
                for (int i = slicer[0]; i < slicer[1] + 1; i += slicer[2]){
                    a.add(num_list[i]);
                }
                int size = a.size();
                int[] answer_four = new int[size];
                for (int i = 0; i < size; i++){
                    answer_four[i] = a.get(i);
                }
                return answer_four;
        }
        return answer;
    }
}