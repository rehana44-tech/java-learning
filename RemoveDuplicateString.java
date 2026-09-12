import java.util.*;
class RemoveDuplicateString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        boolean seen[]=new boolean[256];
        for(int i=0;i<str.length();i++){
             char ch = str.charAt(i);
            if (seen[ch] == false) {
                sb.append(ch);
                seen[ch] = true;
            }
            
        }
        System.out.println(sb);
        
    }
}