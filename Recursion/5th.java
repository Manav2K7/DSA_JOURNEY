//pallindrome checker

class palli{
    static Boolean check(String str , int a,int b){
    
        if(a>=b)
            return true;
        if(str.charAt(a) != str.charAt(b))
            return false ;
        return check(str , a+1 ,b-1) ;

    }

    public static void main(String[] args){
        String c = "aabbaa";
        System.out.print(check(c ,0, c.length()-1 )) ;
    }
}