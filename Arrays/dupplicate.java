class dupplicate {

    static int remove(int arr[] , int n){
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for(int i = 0 ; i< n ; i++){
            if(temp[res-1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }

        }
        for(int i = 0 ; i< n ; i++)
            arr[i] = temp[i];
        return res ;

    }

    public static void main(String[] args){
        int arr[] = {1,2,2,3,3,3,4,5,6,7,8,9};
        int n = arr.length;

        int newSize = remove(arr,n);

        for(int i = 0 ; i< newSize ; i++)
            System.out.print(arr[i] + " ");
        
    }
}