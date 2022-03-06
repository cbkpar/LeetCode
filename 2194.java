class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        for (int i = s.charAt(0) - 'A'; i <= s.charAt(3) - 'A'; i++) {
            for (int j = s.charAt(1) - '0'; j <= s.charAt(4) - '0'; j++) {
                String str = (char) (i + 'A') + "" + (char) (j + '0');
                ans.add(str);
            }
        }
        return ans;
    }
}
