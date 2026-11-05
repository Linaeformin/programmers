import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String num = String.valueOf(i);

            if (num.contains("1") || num.contains("2") || num.contains("3") ||
                num.contains("4") || num.contains("6") || num.contains("7") ||
                num.contains("8") || num.contains("9")) {
                continue;
            }

            list.add(i);
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}