public class Duplicatin {
    public static void NoDup(int[][] twoDarr, int[] oneDarr) {
        int ind = 0;
        for (int i = 0; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[i].length; j++) {
                boolean isDupl = false;
                for (int k = 0; k < ind; k++) {
                    if (oneDarr[k] == twoDarr[i][j]) {
                        isDupl = true;
                        break;
                    }
                }
                if (!isDupl) {
                    oneDarr[ind++] = twoDarr[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] twoDarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {15, 16, 17, 18, 19, 20}};
        int[] oneDarr = new int[20];
        NoDup(twoDarr, oneDarr);
     
        for (int i = 0; i < oneDarr.length; i++) {
            System.out.print(oneDarr[i] + " ");
        }
    }
}
