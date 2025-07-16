package Arrays;
public class FindMissingElement {
    public static int findMissing(int arr[]){
        int i;
        int n=arr.length;
        int xor1=0;
        for(i=0;i<n;i++){
            xor1=xor1^arr[i];
        }
        int xor2=0;
        for(i=1;i<=n+1;i++){
            xor2=xor2^i;
        }
        return xor1^xor2;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,6};
        int res=findMissing(arr);
        System.out.println(res);
    }
    
}
