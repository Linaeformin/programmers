class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        
        // join
        // String.join("구분자", 문자열들")
        // return String.join("", arr);
        return answer;
    }
}