class placeTiles{
    public static int tileCount(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical=tileCount(n-m, m);
        int horizontal=tileCount(n-1, m);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int n=2,m=3;
        int count=tileCount(n, m);
        System.out.println(count);
    }
}