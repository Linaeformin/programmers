import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 1(포켓몬의 종류) : 2(해당 종류 포텟몬의 숫자)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int take = nums.length / 2;
        
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        if (list.size() >= take) answer = take;
        else answer = list.size();
        
        return answer;
    }
}