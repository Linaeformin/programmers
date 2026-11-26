// class Solution {
//     public int solution(String myString, String pat) {
//         int answer = 0;
//         int patLength = pat.length();

//         for (int i = 0; i <= myString.length() - patLength; i++) {
//             String part = myString.substring(i, i + patLength);

//             if (part.equals(pat)) {
//                 answer++;
//             }
//         }

//         return answer;
//     }
// }

class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i< myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}