public class MoveZerosToEnd {
    public static void move(int arr[]){
        int i;
        int j;
        int n=arr.length;
        j=0;
        for(i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
       }
       while(j<n){
        arr[j]=0;
        j++;
       }
       for(i=0;i<n;i++)
          System.out.print(arr[i]+" ");
    }
    public static void main(String args[]){
        int arr[]={1,2,0,5,4,0,9,0};
        move(arr);
    }
    
}
