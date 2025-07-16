package Arrays;
public class MaxMinElement {
    public static void maxElement(int arr[]){
        int i;
        int n=arr.length;
        int maximum=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        System.out.println("Maximum Element is:"+maximum); 
    } 
    public static void minElement(int arr[]){
        int i;
        int n=arr.length;
        int minimum=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
    System.out.println("Miniimum Element is:"+minimum);
    }
    public static void main(String args[]){
        int arr[]=new int[]{3,2,1,56,10000,167};
        maxElement(arr);
        minElement(arr);
    }
}
