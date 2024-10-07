import java.util.Arrays;
class EvenOdd{
    public static void main(String args[]){
        int []arr={1,2,3,4,5,6,7,8,9,0};
        int i=0;
        for(int j=0;j<arr.length;j++){
        if(arr[j]%2==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            
        
        }
        }
    

        System.out.println("swaped" + Arrays.toString(arr));
    
        
    
    
}
}