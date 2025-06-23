class Solution {
    public String longestPalindrome(String s) {
        if (s.isEmpty()) return "";
        int[] indices = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            int[] indices1 = extend(s, i, i);
            if (indices1[1] - indices1[0] > indices[1] - indices[0]) {
                indices = indices1;
            }
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                int[] indices2 = extend(s, i, i + 1);
                if (indices2[1] - indices2[0] > indices[1] - indices[0]) {
                    indices = indices2;
                }
            }
        }
        return s.substring(indices[0], indices[1] + 1);
    }

    private int[] extend(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return new int[]{i + 1, j - 1};
    }
}
