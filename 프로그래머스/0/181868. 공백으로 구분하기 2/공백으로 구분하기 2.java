import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        String[] answer = Arrays.stream(arr)
            .filter(s -> !s.equals(""))
            .toArray(String[]::new);
        
        return answer;
    }
}