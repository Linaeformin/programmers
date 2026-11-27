class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace('A', '_');
        myString = myString.replace('B', 'A');
        myString = myString.replace('_', 'B');
        
        // myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        
        return myString.contains(pat) ? 1: 0;
    }
}