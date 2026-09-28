class permutations{
    public static void print(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
       for(int i=0;i<str.length();i++){
        char n=str.charAt(i);
        String newStr=str.substring(0,i)+str.substring(i+1);
        print(newStr,permutation+n);

       }
    }
    public static void main(String[] args) {
        String str="abc";
        print(str, "");
    }
}