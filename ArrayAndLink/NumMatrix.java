package ArrayAndLink;

public class NumMatrix {
    private int[][] ma;
    private int l, w, re;
    public NumMatrix(int[][] matrix){
        w = matrix.length; l = matrix[0].length;
        ma = new int[w+1][l+1];
        for(int i = 0; i < w; i++){
            for (int j = 1; j <= l; j++){
                ma[i][j] = ma[i][j-1] + matrix[i][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2){
        re = 0;
        for (int i = row1; i <= row2; i ++){
            re += (ma[i][col2+1] - ma[i][col1]);
        }
        return re;
    }

    public static void main(String[] args) {
        int[][] a = new int[20][3];
        System.out.println(a.length);
    }
}
