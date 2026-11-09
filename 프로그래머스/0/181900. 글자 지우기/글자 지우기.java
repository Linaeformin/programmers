class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        char[] array = my_string.toCharArray();
        for (int indice : indices) array[indice] = ' ';
        for (int i = 0; i < array.length; i++){
            if (array[i] != ' ') answer.append(array[i]);
        }
        return answer.toString();
    }
}

// 좋았던 코드
// class Solution {

//     public String solution(String my_string, int[] indices) {
//         String answer = "";
//         String[] tmp = my_string.split("");

//         for (int i = 0; i < indices.length; i++) {
//             tmp[indices[i]] = "";
//         }

//         for (String x : tmp) {
//             answer += x;
//         }
//         return answer;
//     }
// }