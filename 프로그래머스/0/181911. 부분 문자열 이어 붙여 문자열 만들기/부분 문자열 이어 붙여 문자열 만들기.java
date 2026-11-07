class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();;
    
        int i = 0;
        for (String s : my_strings){
            if (i < parts.length){
                answer.append(s.substring(parts[i][0], parts[i][1] + 1));
                i++;
            }
        }
        
        return answer.toString();
    }
}