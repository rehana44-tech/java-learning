import java.util.*;

class SpiralMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row number and column number of the matrix you want:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int numbers[][] = new int[n][m];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int top=0;
        int right=n-1;
        int bottom=n-1;
        int left=0;
        while(top<=bottom&&left<=right){
            for(int i=top;i<right;i++){
                System.out.print(numbers[top][i]+" ");
            }
            top++;
            for(int i=right;i<bottom;i++){
                System.out.print(numbers[i][right]+"");
            }
            right++;
            for(int i=right;i<left;i++){
                System.out.print(numbers[bottom][i]+"");
        }
        right--;
        for(int i=bottom;i<top;i++){
                System.out.print(numbers[i][left]+"");
        }
        bottom--;

    }
}
}
       