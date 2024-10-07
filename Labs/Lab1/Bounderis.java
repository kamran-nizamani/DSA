class Bounderis {
    public static void main(String args[]) {
        int[][] arr = {{1, 2}, {4, 5}};
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                if (j == 0 || i == 0 || i == (row - 1) || j == (col - 1)) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
