package lab6;
public class Task1 {
     int i,j,min_ind;
    void Sort(int  arr[]) {

        int  n=arr.length;
        for(int i=0;i<n-1;i++){
            min_ind=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind]){
                    min_ind=j;
                    int temp=arr[i];
                    arr[i]=arr[min_ind];
                    arr[min_ind]=temp;

                

        }
    }
}
    }
    
            void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
        
    
    public static void main(String  args[]) {
         Task1 ob = new Task1();
        int arr[]={23,45,65,1,45,67};
        ob.Sort(arr);
        ob.printArray(arr);


    }


    }


