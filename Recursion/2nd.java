//Write a recursion func to print number from 1 to n



class recursion1{
    static void fun(int n){
        if(n<=0)
            return;
        else
        fun(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        fun(3);
    }
}