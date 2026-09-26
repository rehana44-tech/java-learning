class firstNegative {
    public static boolean[] map=new boolean[26];

    public static void duplicate(String str, int i,String newStr) {
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
       if(map[str.charAt(i)-'a']==true){
        duplicate(str, i+1,newStr);
       }
       else{
        newStr+=str.charAt(i);
        map[str.charAt(i)-'a']=true;
        duplicate(str, i+1, newStr);
       }
       
    }

    public static void main(String[] args) {

        String str = "abbccda";

        duplicate(str, 0, "");
    }
}