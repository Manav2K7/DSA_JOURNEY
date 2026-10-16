class leader {

    static void leaders(int arr[] , int n){
        for(int i = 0 ; i<n ; i++){
            boolean flag = false;
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] <=arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.print(arr[i] + " ");
            }
        }   
    }
    


public static void main(String[] args){
    int arr[] = {16, 17, 4, 3, 5, 2};
    int n = arr.length;
    leaders(arr, n);

}

}
