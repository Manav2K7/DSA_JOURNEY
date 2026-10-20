package BItMagic ;

// Find the only odd occuraning number
//By arrays
/* class occurance{
    static int occur(int arr[]){
        int n = arr.length ;
        
        for(int i = 0 ; i < n ; i++){
            int count = 0 ;
            for(int j = 0 ; j < n ; j++){
            if(arr[i] == arr[j])
                count++;
        }
            if(count%2 != 0)
                return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,4,4,4,5,5};
        System.out.println(occur(arr));
    }
}
    */


//By bit 


class occurance{
    static int occur(int arr[]){
        int n = arr.length ;
        int res = 0;
        for(int i=0;i<n;i++){
            res = res^arr[i];
        }
        return res ;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,4,4,4,5,5};
        System.out.println(occur(arr));
    }

}
