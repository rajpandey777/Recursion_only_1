public class Recursion4 {

    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fun = factorial(n-1);
        int fact =n* fun;
        return fact;
    }
    public static void main(String[] args){
        int n =5;
        int ans = factorial(n);
        System.out.println(ans);
    }
    
}
