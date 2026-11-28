import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (i < arr.length){
            if (list.isEmpty()) list.add(arr[i]);
            else if (list.get(list.size() - 1) == arr[i]) list.remove(list.size() - 1);
            else if (list.get(list.size() - 1) != arr[i]) list.add(arr[i]);
            i++;
        }
        
        if (list.isEmpty()) return new int[]{-1};
        return list.stream().mapToInt(num -> num).toArray();
    }
}