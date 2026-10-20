// class Solution {
//     public int solution(int number, int limit, int power) {
//         int answer = 0;
        
//         for (int i = 1; i <= number; i++){
//             int count = 0;
            
//             for (int j = 1; j <= i; j++){
//                 if (i % j == 0) count++;
//             }
            
//             if (count > limit) count = power;
//             answer += count;
//         }
//         return answer;
//     }
// }

class Solution {

    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}