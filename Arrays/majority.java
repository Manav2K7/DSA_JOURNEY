//Majority Element

/* class Majority{
    static int majority(int arr[]){
        int n = arr.length;
        int maj = (n/2);
        
        for(int i = 0 ; i < n ; i ++ ){
            int count = 0;
            for(int j = 0 ; j<n;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count >= maj)
                return i;
        }
        return -1;
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,3,2,4,5,2,2};
        System.out.println(majority(arr));
    }
}

*/

class majority{
    static int majority(int arr[]){
        int n = arr.length;
        int res = 0 ;
        int count = 1;
        for(int i =1 ; i<n;i++){
            if(arr[res]==arr[i])
                count++;
            else
                count--;
            if(count == 0){
                res = i ; 
                count = 1;
            }
        }
        count = 0 ;
        for(int i =1 ; i<n;i++){
            if(arr[res]==arr[i])
                count++;
        }
        if(count<n/2)
                return -1;
    
    return res;
}
    public static void main(String args[]){
        int arr[] = {1,2,2,3,2,4,5,2,2};
        System.out.println(majority(arr));
    }
}