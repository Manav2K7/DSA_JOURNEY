//Write a recursion func to print number from n to 1

class recursion {

static void fun(int n){
    if(n==0)
        return ;
    else
    System.out.print( n + " " ) ;
    fun(n-1) ;
}

    public static void main(String[] args){
        fun(5);
    }
}


//output:- 5 4 3 2 1 