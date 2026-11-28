import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            if (list.contains(arr[i])) continue;
            list.add(arr[i]);
            if (list.size() == k) break;
        }
        
        while (list.size() < k){
            list.add(-1);
        }
        return list.stream().mapToInt(num -> num).toArray();
    }
}