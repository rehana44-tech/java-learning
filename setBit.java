import java.util.*;

class setBit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=2;
        int mask=1<<pos;
        int notMask=~(mask);
        if((n & mask)!=0){
            System.out.println("bit is set");
            System.out.println("________________");
            System.out.println("Clearing the bit: ");
            int newRes=n & notMask;
            System.out.println(newRes);
        }
        else{
            System.out.println("bit is not set");
            System.out.println("_________________");
            int result=n|mask;
            System.out.println(result);
            System.out.println("The bit is now set");
        }

    }
}