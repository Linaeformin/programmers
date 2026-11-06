class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder builder = new StringBuilder(my_string);

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1] + 1;

            StringBuilder middle =
                new StringBuilder(builder.substring(start, end));

            builder.replace(start, end, middle.reverse().toString());
        }

        return builder.toString();
    }
}

// 좋았던 풀이
// class Solution {

//     char[] arr;

//     public String solution(String my_string, int[][] queries) {

//         arr = my_string.toCharArray();

//         for (int[] query : queries) {
//             reverse(query[0], query[1]);
//         }

//         return new String(arr);
//     }

//     private void reverse(int s, int e) {
//         while (s < e) {
//             char temp = arr[s];
//             arr[s++] = arr[e];
//             arr[e--] = temp;
//         }
//     }
// }