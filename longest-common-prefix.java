class Solution {
    public String longestCommonPrefix(String[] strs) {
        int sz = strs.length;
        int l = strs[0].length();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < sz; j++) {
                if (strs[j].length() <= i) return strs[0].substring(0, i);
                if (strs[0].charAt(i) != strs[j].charAt(i)) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
