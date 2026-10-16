// Maximum consecutive ones in a binary array

class olution{
    static int maxC(int arr[]){
        int n = arr.length ;
        int count = 0 ;
        int curr = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            if(arr[i] == 0){
                curr = 0 ;
            }
            else{
                curr++ ;
                count = Math.max(count , curr) ;
            }
        }
        return count ;  
    }
    public static void main(String[] args){
        int arr[] = { 1,1,0,1,1,1,0,1};
        System.out.println(maxC(arr));

    }
}