class factorialRecursion{
    public static int facto(int n){
        if(n==1){
            return 1;
        }
        int i=facto(n-1);
       int fact=n*i;
       return fact;
        
    }
    public static void main(String[] args) {
        int ans=facto(5);
        System.out.println(ans);
    }
}