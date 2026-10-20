package BItMagic;

// count set bits
class count{
    static int countSet(int n){
        int res = 0;
        while(n > 0 ){
            if(n%2!=0)
            res++; 
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 13;
        System.out.println( countSet(n));
    }
}