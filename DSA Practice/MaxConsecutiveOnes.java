public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int arr[]){
        int i;
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        int cnt=0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                cnt+=1;
                maxi=Math.max(maxi,cnt);
            }else{
                cnt=0;
            }
        }
        return maxi;
    }
    public static void main(String args[]){
        int arr[]={1,2,0,0,3,0,9,0,0,0,8,0};
        int res=maxConsecutiveOnes(arr);
        System.out.println(res);
    }
    
}
