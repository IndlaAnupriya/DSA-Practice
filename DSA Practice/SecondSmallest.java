public class SecondSmallest {
    public static int secondSmallest(int arr[]){
        int n=arr.length;
        if(n<2){
            return -1;
        }
        int smallest=arr[0];
        int sSmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]!=smallest && arr[i]<sSmallest ){
                sSmallest=arr[i];
            }
        }
        if(sSmallest==Integer.MIN_VALUE){
            return -1;
        }
        return sSmallest;
    }
    public static void main(String args[]){
        int arr[]={1,23,21,8,65,32};
        int result=secondSmallest(arr);
        System.out.println("The second smallest element is:"+result);
    }
    
}
