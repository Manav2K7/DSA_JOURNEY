/* Trapping rain water problem */

class Solution{
    static int trapping(int arr[]){
        int n = arr.length ;
        int res = 0 ;
        for(int i = 0 ; i <n ; i++){
            int lmax = arr[i];
            for(int j = 0 ; j < i ; j++){
                lmax = Math.max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for(int j = i+1 ; j < n ; j++){
                rmax = Math.max(rmax,arr[j]);
            }
            res += Math.min(lmax,rmax) - arr[i] ;
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = { 3,0,0,2,0,4};
        System.out.println(trapping(arr));

    }
}