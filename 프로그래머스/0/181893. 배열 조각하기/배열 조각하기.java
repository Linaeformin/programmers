import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arr) {
            list.add(value);
        }

        for (int i = 0; i < query.length; i++) {
            int index = query[i];

            if (i % 2 == 0) {
                list.subList(index + 1, list.size()).clear();
            } else {
                list.subList(0, index).clear();
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}