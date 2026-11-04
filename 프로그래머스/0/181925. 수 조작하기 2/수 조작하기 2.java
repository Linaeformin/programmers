class Solution {
    public StringBuilder solution(int[] numLog) {
        // String answer = "";
        // for (int i = 1; i < numLog.length; i++){
        //     switch(numLog[i] - numLog[i-1]){
        //         case 1: answer += 'w'; break;
        //         case -1: answer += 's'; break;
        //         case 10: answer += 'd'; break;
        //         case -10: answer += 'a'; break;
        //         default: break;
        //     }
        // }
        // return answer;
        
        StringBuilder answer = new StringBuilder(numLog.length - 2);
        for (int i = 1; i < numLog.length; i++){
            switch(numLog[i] - numLog[i-1]){
                case 1: answer.append('w'); break;
                case -1: answer.append('s'); break;
                case 10: answer.append('d'); break;
                case -10: answer.append('a'); break;
                default: break;
            }
        }
        return answer;
    }
}