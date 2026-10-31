class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
        
        // StringBuffer 기존 공간에 내용을 추가하고 공간이 부족해지면 더 큰 공간을 확보
        // StringBuffer answer = new StringBuffer();
        // for(int i = 0; i < k; i++)
        //     answer.append(my_string);
        // return answer.toString();
    }
}