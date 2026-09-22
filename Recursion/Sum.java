class Sum{
    static int fun(int n){
        if(n<10)
            return n;

        return n%10 + n/10 ;

    }
    public static void main(String[] args){
        System.out.print(fun(1234));
    }

}