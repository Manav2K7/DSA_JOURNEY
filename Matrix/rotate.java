package Matrix;

class Rotate {
    static void rotate(int mat[][]){
        int n = mat.length;
        
        int[][] temp = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j = 0 ; j < n ; j++)
                temp[i][j] = mat[j][n-1-i];
        }
        for(int i=0;i<n;i++){
            for(int j = 0 ; j < n ; j++)
                mat[i][j] = temp[i][j];
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

    }
}
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        rotate(arr);
          
    }
}
