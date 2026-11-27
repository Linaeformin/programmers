class Solution {
    public int solution(String binomial) {
        String[] array = binomial.split(" ");
        switch (array[1]){
            case "+": return Integer.parseInt(array[0]) + Integer.parseInt(array[2]);
            case "-": return Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
            case "*": return Integer.parseInt(array[0]) * Integer.parseInt(array[2]);
            default: return 0;
        }
    }
}