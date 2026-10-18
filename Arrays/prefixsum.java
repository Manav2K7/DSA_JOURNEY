//prefix sum

class prefix{
    static int prefix(int arr[] , int l,int r){
        int n = arr.length;
        int sum = 0;
        for(int i = l ; i <=r ; i++)
            sum+=arr[i];    
        return sum;    
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int l = 1;
        int r = 3;
        System.out.println(prefix(arr,l,r));
    }
}