class maxdiffer {
    static int difference(int arr[] , int n){
        int res = arr[1] - arr[0] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                res = Math.max(res , arr[j] - arr[i]) ;
            }
        }
        return res ;
    }

    public static void main(String[] args){
        int arr[] = {2,10,3,6,8,1,4};
        int n = arr.length ;
        System.out.println(difference(arr , n));

    }
}
