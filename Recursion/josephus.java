class josephus {
    static int kill(int n , int k){
        if(n==1)
            return 0;
        return (kill(n-1 ,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.print(kill(7,2));
    }
}
