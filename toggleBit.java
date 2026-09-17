import java.util.*;

class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("enter position of the bit to flip");
        int pos = sc.nextInt();

        int mask = 1 << pos;

        int result = n ^ mask;

        System.out.println("After flipping the number becomes: " + result);
    }
}