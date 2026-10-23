// package BItMagic;
// class Occurancetwice {
//     static void occr(int arr[]){
//         int n = arr.length ;
//         int XOR = 0 , res1 = 0 , res2 = 0;
//         for(int i = 0 ; i<n;i++){
//             XOR = XOR^arr[i] ;
//         }
//         int sn = XOR&~(XOR-1);
//         for(int i = 0 ; i<n;i++){
//         if((arr[i]&sn)!= 0)
//             res1 = res1^arr[i];
//         else
//             res2 = res2^arr[i];
//         }
//         return (res1,res2);
//     }
//     public static void main(String[] args) {
//         int arr[] = {3,4,3,4,5,4,4,6,7,7};
//         System.out.println(occr(arr));
//     }
    
// }
