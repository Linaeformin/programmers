import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        
        String[] answer = Arrays.stream(arr)
            .filter(s -> !s.equals(""))
            .toArray(String[]::new);
        
        // return answer;
        return my_string.trim().split(" +");
    }
}