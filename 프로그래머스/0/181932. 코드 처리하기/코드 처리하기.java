class Solution {
    public String solution(String code) {
        String answer = "";
        String ret = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            if (mode == 0){
                if (c != '1' && i % 2 == 0){
                    ret += code.charAt(i);
                }
                else if (c == '1') mode = 1;
            }
            else {
                if (c != '1' && i % 2 != 0){
                    ret += code.charAt(i);
                }
                else if (c == '1') mode = 0;
            }
        }
        
        if (ret.length() == 0) return "EMPTY";
        return ret;
    }
}