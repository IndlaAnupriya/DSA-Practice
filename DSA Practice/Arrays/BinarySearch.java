public class BinarySearch {
    public static int search(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }else if(x<arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,34,56,78,90};
        int x=56;
        int res=search(arr,x);
        System.out.println("The value is found at index:"+res);

    }
    
}
