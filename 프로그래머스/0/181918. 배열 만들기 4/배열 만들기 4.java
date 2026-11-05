import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            if (list.size() == 0) {
                list.add(arr[i]); 
                i++;
            }
            else if (list.get(list.size()- 1) < arr[i]) {
                list.add(arr[i]); 
                i++;
            }
            else list.remove(list.size() - 1);
        }
        
        // 1) stream 사용
        return list.stream().mapToInt(num -> num).toArray();
        // return stk;
    }
}