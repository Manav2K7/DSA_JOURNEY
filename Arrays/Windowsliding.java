// Window sliding technique 

class window{
    static int sliding(int arr[] , int k){
        int n = arr.length;
        int curr_sum = 0;
        int max_sum = 0 ;
        for(int i = 0; i < k ; i++)
            curr_sum += arr[i];
        max_sum = curr_sum;
        for(int i = k; i < n; i++)
            curr_sum += (arr[i] - arr[i - k]);
            
        curr_sum = Math.max(curr_sum , max_sum);
            
        
        return curr_sum;
    }
    public static void main(String args[]){
        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 3;
        System.out.println(sliding(arr , k));
    }
}