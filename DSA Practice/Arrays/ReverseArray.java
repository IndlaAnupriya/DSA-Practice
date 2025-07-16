package Arrays;
public class ReverseArray {
    public static void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        public static void main(String args[]){
            int arr[] = {1,2,3,4,5};
            reverseArray(arr);
            for(int x:arr)
              System.out.print(x+" ");
        }
    }
} 
