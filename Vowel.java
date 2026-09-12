import java.util.*;
class Vowel{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char n=str.charAt(i);
            if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
                sb.append(n);

            }
        }
        System.out.println(sb);
    }
}