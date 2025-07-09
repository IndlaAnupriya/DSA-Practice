public class MaxMinElement {
    public static void maxMinElement(int arr[]){
        int i;
        int n=arr.length;
        int maximum=arr[0];
        int minimum=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
            if(arr[i]<minimum){
                minimum=arr[i];
        }
     }
        System.out.println("Maximum Element is:"+maximum+"\n"+"Minimum Element is:"+minimum); 
    } 
    public static void main(String args[]){
        int arr[]=new int[]{3,2,1,56,10000,167};
        maxMinElement(arr);
    }
}
