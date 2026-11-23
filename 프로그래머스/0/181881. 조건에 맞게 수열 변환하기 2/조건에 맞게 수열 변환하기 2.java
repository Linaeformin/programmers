import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        int[] before = Arrays.copyOf(arr, arr.length);
        int[] after = new int[arr.length];
        
        while (true){
            for (int i = 0; i < arr.length; i++){
                if (before[i] >= 50 && before[i] % 2 == 0){
                    after[i] = before[i] / 2;
                } else if (before[i] < 50 && before[i] % 2 != 0){
                    after[i] = before[i] * 2 + 1;
                } else {
                    after[i] = before[i];
                }
            }

            answer++;

            if (Arrays.equals(before, after)) {
                return answer - 1;
            }
            
            before = Arrays.copyOf(after, after.length);
        }
    }
}