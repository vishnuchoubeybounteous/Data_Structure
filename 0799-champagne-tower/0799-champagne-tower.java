class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[102][102];
        tower[0][0] = (double) poured;

        for (int i = 0; i <= query_row; i++) {
            for (int c = 0; c <= i; c++) {
                if (tower[i][c] > 1.0) {
                    double excess = (tower[i][c] - 1.0) / 2.0;
                    tower[i][c] = 1.0;
                    tower[i + 1][c] += excess;
                    tower[i + 1][c + 1] += excess;
                }
            }
        }
        return tower[query_row][query_glass];
    }
}