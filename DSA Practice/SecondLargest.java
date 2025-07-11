public class SecondLargest {
    public static int secondLargest(int arr[]){
        int n=arr.length;
        if(n<2){
            return -1;
        }
        int largest=arr[0];
        int sLargest=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i]!=largest && arr[i]>sLargest ){
                sLargest=arr[i];
            }
        }
        if(sLargest==Integer.MIN_VALUE){
            return -1;
        }
        return sLargest;
    }
    public static void main(String args[]){
        int arr[]={1,23,21,8,65,32};
        int result=secondLargest(arr);
        System.out.println("The second largest element is:"+result);
    }
    
}
