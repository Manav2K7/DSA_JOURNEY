package BItMagic;

class powerset {
    static void powerset(String str){
        int n = str.length() ;
        int powSize = (int) Math.pow(2,n) ;
        for(int i = 0 ; i < powSize ; i++){
            for(int j = 0 ; j<n ;j++){
                if((i & (1<<j))!=0)
                    System.out.println(str.charAt(j) +" ");
            }

        }

    }
    public static void main(String[] args){
        String str = "ABC";
        powerset(str);
    }
    
}
