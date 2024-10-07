class BasicSorting{
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    static void Selection(int ar[]){
        for(int i=0;i<ar.length-1;i++){
            int min = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min = j;
                }
                }
                int temp = ar[i];
                ar[i] = ar[min];
                ar[min] = temp;
                }

    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
    }
    







    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        Selection(arr);
        printArr(arr);

    }
}