import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        
        while (true){
            if (n == 1) break;
            if (n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            list.add(n);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}