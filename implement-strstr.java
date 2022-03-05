class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        return KMP(haystack, needle);
    }
    
    private static int KMP(String str, String pattern) {
        int[] pi = getPI(pattern);
        char[] s = str.toCharArray();
        char[] p = pattern.toCharArray();
        int sz = str.length();
        int j = 0;
        for (int i = 0; i < sz; i++) {
            while (j > 0 && s[i] != p[j]) j = pi[j - 1];
            if (s[i] == p[j]) {
                if (j == p.length - 1) return i - j;
                j++;
            }
        }
        return -1;
    }

    private static int[] getPI(String pattern) {
        char[] p = pattern.toCharArray();
        int j = 0;
        int sz = p.length;
        int[] pi = new int[sz];
        for (int i = 1; i < sz; i++) {
            while (j > 0 && p[i] != p[j]) j = pi[j - 1];
            if (p[i] == p[j]) pi[i] = ++j;
        }
        return pi;
    }
}
