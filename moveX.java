class moveX{
    static int count=0;
    public static void move(String str,int i,String newS){
        if(i==str.length()){
            for( i=0;i<count;i++){
                newS+='x';
            }
            System.out.println(newS);
            return;
        }
        char n=str.charAt(i);
        if(n=='x'){
             count++;
              move(str,i+1,newS);
        }
        else{
            newS+=n;
            move(str,i+1,newS);
        }

        }
       
    public static void main(String[] args) {
        String str="axbcxxd";
        move(str,0,"");
    }
}
