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