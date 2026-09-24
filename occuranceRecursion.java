//recursion
class occuranceRecursion{
     static int first=-1;
     static int last=-1;
    public static void occur(String str,int idx,char target){
        if(idx==str.length()){
            System.out.println(" first occurrence at index: " + first);
            System.out.println(" last occurrence at index: " + last);
            return;

        }
    if(str.charAt(idx)==target){
        if(first==-1){
            first=idx;
        
        }
            last=idx;
            
    }
      occur(str,idx+1,target);

    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        occur(str,0,'c');
       
    }
    
}