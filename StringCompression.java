import java.util.*;

class StringCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < str.length()) {

            char ch = str.charAt(i);

            int count = 0;

            while (i < str.length() && str.charAt(i) == ch) {

                count++;
                i++;
            }

            sb.append(ch);
            sb.append(count);
        }

        System.out.println(sb);
    }
}