class Sum_sbset {
    static int check(int arr[],int n,int sum){
        if(n == 0)
            return (sum==0)?1:0;
        return check(arr, n-1,sum )+check(arr, n-1, sum-arr[n-1]);
    }
    public static void main(String[] args){
int arr[] = {10,20,15};
        int sum=25 ;
        int n = arr.length;
        System.out.print(check(arr,n,sum));
    }
}
