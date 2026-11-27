class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace('A', '_');
        myString = myString.replace('B', 'A');
        myString = myString.replace('_', 'B');
        
        return myString.contains(pat) ? 1: 0;
    }
}