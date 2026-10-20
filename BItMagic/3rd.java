package BItMagic;

//To cehck wheater the given number is power of 2 or not

class check{
    static boolean checkpower(int n){
        if(n==0)
            return false;
        while(n!=1){
            if(n%2 !=0)
                return false;
            n=n/2;
        }
        return true ;
    }
    public static void main(String[] args) {
        int n = 22;
        System.out.println(checkpower(n));
    }
}