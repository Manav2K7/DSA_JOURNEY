package BItMagic;

// check if K-th bit is set or not

class check{
    static void check(int n , int k){
        if( n & ( << (k-1)) != 0 )
            System.out.println("yes");
        else
            System.out.println("no");

    }
    public static void main(String[] args){
        int n = 5;
        int k = 1 ;
        check(n , k);
    }
}