package Arrays;
public class LinearSearch {
    public static int search(int arr[],int v){
        int i;
        int n=arr.length;
        for(i=0;i<n;i++){
            if(arr[i]==v){
                return i;
            }
        }
        return -1;
    }    
    public static void main(String args[]){
        int arr[]={1,23,12,87,45,3};
        int v=23;
        int res=search(arr,v);
        System.out.println(res);
        }
}
