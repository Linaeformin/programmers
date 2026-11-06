class Solution {
    public String solution(String my_string, int[][] queries) {

        StringBuilder builder_my = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++){

            StringBuilder builder_before = new StringBuilder(builder_my.substring(0, queries[i][0]));
            StringBuilder builder_after = new StringBuilder(builder_my.substring(queries[i][1] + 1, builder_my.length()));
            StringBuilder builder_middle = new StringBuilder(builder_my.substring(queries[i][0], queries[i][1] + 1));
            
            builder_middle.reverse();
            
            builder_my.replace(0, queries[i][0], String.valueOf(builder_before));
            builder_my.replace(queries[i][1] + 1, builder_my.length(), String.valueOf(builder_after));
            builder_my.replace(queries[i][0], queries[i][1] + 1, String.valueOf(builder_middle));
       
        }
        
        return builder_my.toString();
    }
}