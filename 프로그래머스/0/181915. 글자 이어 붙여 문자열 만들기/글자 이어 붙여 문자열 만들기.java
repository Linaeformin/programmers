class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder builder_answer = new StringBuilder();
        char[] char_my = my_string.toCharArray();
        for (int num: index_list){
            builder_answer.append(char_my[num]);
        }
        return builder_answer.toString();
    }
}