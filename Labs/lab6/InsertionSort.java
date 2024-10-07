package lab6;
/* 
public class InsertionSort {

    
        void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
    
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    
        
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
    
            System.out.println();
        }
    
    
        public static void main(String args[])
        {
            int arr[] = { 12, 11, 13, 5, 6 };
    
            InsertionSort ob = new InsertionSort();
            ob.sort(arr); 
    System.out.println("sorted Arrays is :");
            printArray(arr);
        }
    }
    /* */
    public class InsertionSort{
        void sort(int []arr){
            int n =arr.length;
            for(int i=0;i<n;i++){
                int k=arr[i];
                int j=i-1;
                while (j>=0 && arr[j]>k) 
                {
                    arr[j+1]=arr[j];
                    j=j-1;
                    
                }
                arr[j+1]=k;


            }
        }
        
        static void printArr(int []arr){
            int n=arr.length;
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+"");
                
            }

        }
        public static void main(String[] args) {
            InsertionSort ob=new InsertionSort();
            int arr[]={12,11,13,5,6};
            ob.sort(arr);
            System.out.println("Sorted array is");
            ob.printArr(arr);

        }

    } 

