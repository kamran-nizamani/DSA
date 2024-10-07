import java.util.Arrays;
class EvenOdd{
    int[]arr={1,3,4,5,0};
    int i=0;
    for(int j=0; j<arr.length;j++){
        if(arr[j] %2==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
    }
    System.out.println("Swaped"+Arrays.toString(arr);)

}
