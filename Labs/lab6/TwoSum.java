package lab6;
import java.util.Arrays;
public class TwoSum {
    public static boolean twosum(int []arr ,int k){
        Arrays.sort(arr);
        int left=1;
        int right=arr.length-1;
        while (left<=right) {
            int sum=arr[left]+arr[right];
            if(sum==k){
                return true;


            
        }
        else if (sum<k) {
            left++;
            
        }
        else{
            right--;

        }
        
    }
    return false;


    
}
public static void main(String[] args) {
    int[] arr = {4, 2, 3, 4, 5,};
    int k = 7;
    boolean result=twosum(arr, k)   ;
    System.out.println(result);
    




}

}
