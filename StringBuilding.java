import java.util.*;
class StringBuilding{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int n=word.length();
        StringBuilder newWord=new StringBuilder();
        for(int i=0;i<word.length();i++){
            newWord.append(word.charAt(n-1-i));
        }
        System.out.println(newWord);
   

   




    }
}