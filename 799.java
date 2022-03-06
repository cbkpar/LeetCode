class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] amount = new double[101][101];
        amount[0][0] = poured;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j <= i; j++) {
                if (amount[i][j] > 1) {
                    amount[i + 1][j] += (amount[i][j] - 1) / 2;
                    amount[i + 1][j + 1] += (amount[i][j] - 1) / 2;
                    amount[i][j] = 1;
                }
            }
        }
        return amount[query_row][query_glass];
    }
}
