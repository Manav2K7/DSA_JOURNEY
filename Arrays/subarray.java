class subarray {
    static int Sol(int arr[]) {
        int n = arr.length ;
        int sum = arr[0] ;
        for(int i = 0 ; i < n ;i ++){
            int curr = 0; 
        for(int j = i ; j < n ; j++){
            curr = curr + arr[j] ;
        sum = Math.max(sum,curr);
        }

        }
        return sum ;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,-9,4,-1,-2} ;
        System.out.println(Sol(arr));
    }
    
}




// efficient solution

// class subarray {
//     static int Sol(int arr[]) {
//         int n = arr.length ;
//         int sum = arr[0] ;
//         int curr = arr[0]; 
//         for(int i = 1 ; i < n ;i ++){
            
//             curr = Math.max(curr + arr[i] , arr[i]);
//             sum = Math.max(sum,curr);
            
//         }
//     return sum ;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,3,-9,4,-1,-2} ;
//         System.out.println(Sol(arr));
//     }
    
// }
