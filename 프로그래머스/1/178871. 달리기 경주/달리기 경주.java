import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        // 초기 순위
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
    
        int currentId = 0;  // 올라오는 선수의 원래 순위
        
        for (int i = 0; i <callings.length; i++){
            currentId = map.get(callings[i]);
            
            String target = players[currentId - 1];

            players[currentId - 1] = players[currentId];
            players[currentId] = target;
            
            map.put(callings[i], currentId - 1);
            map.put(target, currentId);
        }
        
        String[] answer = players;
        
        return answer;
    }
}