class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // 인상 깊었던 풀이. 전, 후, 교체할 부분을 이어 붙이는 아이디어 좋았다.
        // String before = my_string.substring(0, s);
        // String after = my_string.substring(s + overwrite_string.length());
        // return before + overwrite_string + after;

        // 배열 선언
        char[] my_array = my_string.toCharArray();
        
        // 배열과 String의 길이 가져오는 방식 차이
        for (int count = 0; count < overwrite_string.length(); count++){
            // String 객체를 단순 읽기만 할 때는 charAt(n) 사용
            my_array[s + count] = overwrite_string.charAt(count);
        }
        
        // String은 객체이기 떄문에 객체 생성하는 방식으로
        String answer = new String(my_array);
        return answer;
    }
}

