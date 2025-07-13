public class RotateByDPlaces {
    public static void reverse(int arr[],int first,int last){
        int i,j;
        i=first;
        j=last;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int d=3;
        reverse(arr,0,d-1);//it will reverse array upto d place  3 2 1 4 5 6  7
        reverse(arr,d,n-1);//it will reverse array from d to n  3 2 1 7 6 5 4 
        reverse(arr,0,n-1);//it will reverse whole array  4 5 6 7 1 2 3
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    
}
