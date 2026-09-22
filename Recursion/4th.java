// factorial with tail recursive

class fourth{
    static int fact(int n, int k){
        if(n==0)
            return k ;
        else 
            return fact(n-1,n*k);
    }
    public static void main(String[] args){
        
        System.out.print(fact(6,1));
    }
}