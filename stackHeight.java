class stackHeight{
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
       if(n%2==0){
        int xn=calcPower(x,n/2)*calcPower(x,n/2);
        return xn;
       }
       else{
        int xn=x*calcPower(x,n/2)*calcPower(x,n/2);
        return xn;
       }
       
    }
    public static void main(String[] args) {
        int ans=calcPower(2,3) ;
        System.out.println(ans);
    }
}