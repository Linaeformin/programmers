class Solution {
    public String[] solution(String myStr) {
        String a = myStr.replace("a", "_").replace("b", "_").replace("c", "_").replaceFirst("^_+", "");
        if (a.length() == 0) return new String[]{"EMPTY"};
        return a.split("_+");
    }
}