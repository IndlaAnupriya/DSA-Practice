package Arrays;
public class CheckIfSorted {
    public static boolean check(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,23,21,76,89};
        boolean result=check(arr);
        System.out.println("Arrays is sorted:"+result);
    }
    
}
l̥