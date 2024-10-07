public class NLArray {

    
    public void extractBoundaries(int arr[][]) {
        if (arr.length == 0) 
        return;

        int rows = arr.length;
        int cols = arr[0].length;

    
        for (int col = 0; col < cols; col++) {
            System.out.print(arr[0][col] + " ");
        }
        System.out.println();

        
        for (int row = 1; row < rows - 1; row++) {
            System.out.print(arr[row][0] + " ");
            System.out.print(arr[row][cols - 1] + " ");
            System.out.println();
        }

    
        for (int col = 0; col < cols; col++) {
            System.out.print(arr[rows - 1][col] + " ");
        }
        System.out.println();
    }

    
    public void cropCenterPart(int arr[][]) {
        if (arr.length <= 2 || arr[0].length <= 2) return;

        for (int row = 1; row < arr.length - 1; row++) {
            for (int col = 1; col < arr[row].length - 1; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NLArray nlArray = new NLArray();
        int[][] imageArray = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Boundaries:");
        nlArray.extractBoundaries(imageArray);
        
        System.out.println("Center Part:");
        nlArray.cropCenterPart(imageArray);
    }
}
