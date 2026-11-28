class Solution {
    public String[] solution(String myStr) {
        String normalized = myStr.replaceAll("[abc]+", "_")
                                 .replaceFirst("^_", "");

        if (normalized.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        return normalized.split("_");
    }
}