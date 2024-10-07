package lab7;


public class OneDArr {
    public static void Forword(int arr[],int ind){
        if(ind==arr.length) return;
        System.out.println(arr[ind]+" ");
        Forword(arr,ind+1);



        }
        public static void ReverseDirection(int arr[],int ind){
            if(ind<0) return;
            System.out.println(arr[ind]+" ");
            ReverseDirection(arr,ind-1);
            }
        
        public static void main(String[] args) {
           int arr[]={1,2,3,4,5};
        
            System.out.println("Forword Direction :");
            Forword(arr,0);
            System.out.println("\n Rverse Direction");
            ReverseDirection(arr,arr.length-1);



        }


    }

    

