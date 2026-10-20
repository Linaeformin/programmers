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
        int targetId = 0;   // 추격된 선수의 순위
        int tmp = 0;
        
        for (int i = 0; i <callings.length; i++){
            currentId = map.get(callings[i]);
            
            targetId = map.get(players[currentId - 1]);
            
            map.put(callings[i], targetId);
            map.put(players[currentId - 1], currentId);
            
            String target = players[targetId];
            players[targetId] = players[currentId];
            players[currentId] = target;
        }
        
        String[] answer = players;
        
        return answer;
    }
}