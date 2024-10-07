class Dupl {
    public static void NoDup(int[][] twoDarr, int[] oneDarr) {
        int in = 0;
        for (int i = 0; i < twoDarr.length; i++) {
            for (int j = 0; j < twoDarr[i].length; j++) {
                boolean isDupl = false;
                for (int k = 0; k < in; k++) {
                    if (oneDarr[k] == twoDarr[i][j]) {
                        isDupl = true;
                        break; // Exit loop if duplicate is found
                    }
                }
                if (!isDupl) {
                    oneDarr[in++] = twoDarr[i][j]; // Store unique element
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] twoDarr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        int[] oneDarr = new int[20]; // Allocate sufficient size for unique elements
        NoDup(twoDarr, oneDarr);
        for (int i = 0; i < oneDarr.length; i++) {
            if (oneDarr[i] != 0) { // Print only non-zero elements
                System.out.print(oneDarr[i] + " ");
            }
        }
    }
}
