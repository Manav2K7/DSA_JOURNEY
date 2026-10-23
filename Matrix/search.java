package Matrix;

class search {
    static void Search(int mat[][] , int x){
        int R = mat.length;
        int C = mat[0].length;
        for(int i=0 ; i<R ; i++){
            for(int j=0 ; j<C ;j++){
                if(mat[i][j]==x){
                    System.out.print("Found at C:"+ i+ " "+","+"R:"+ j + " ");
                    return ;
                }
            }
        }System.out.print("Not Found");

    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        Search(arr, 5);
    }
    
}
