/*buy and sell stock
Efficient solution */
class stock {
    static int maxprofit(int arr[]){
        int profit = 0 ;
        int n = arr.length ;

        for(int i = 1 ; i < n ; i++){
                if(arr[i] > arr[i-1]){
                    profit += arr[i] - arr[i-1] ;
                
            }

        }        return profit ;

    }


    public static void main(String[] args){
        int arr[] = { 10,20,30};
        System.out.println(maxprofit(arr));

    }
    
}
