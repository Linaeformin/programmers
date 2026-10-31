import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        // copyOfRange
        // Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스)
        // * 시작 인덱스는 포함, 끝 인덱스는 미포함
        answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}