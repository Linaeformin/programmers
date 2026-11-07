import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++){
            int str = Integer.parseInt(intStrs[i].substring(s, s + l));
            if (str > k) list.add(str);
        }
        
        int[] answer = list.stream().mapToInt(n -> n).toArray();
        
        return answer;
    }
}