public class RemoveDuplicates {
    //remove 
    public static int remove(int arr[]){
        int n=arr.length;
        int idx=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[idx-1]){
                arr[idx++]=arr[i];
            }
        }
        return idx;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,3,4,5,5};
        int result=remove(arr);
        System.out.println("The length of the array after removing duplicates:"+result);
        System.out.println("After removing duplicates:");
        for(int i=0;i<result;i++)
          System.out.print(arr[i]+" ");
    }
}
