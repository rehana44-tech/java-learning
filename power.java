import java.util.*;

class power {
    public static int findPower(int x,int n){
        return (int)Math.pow(x,n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a base number: ");
        int x=sc.nextInt();
        System.out.println("enter the power you want: ");
        int n=sc.nextInt();
        System.out.println(findPower(x, n));
    }
}