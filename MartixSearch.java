import java.util.*;
class MartixSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row number and column number of the matrix you want : ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int [rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number you wanna search: ");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x==numbers[i][j]){
                    System.out.println("The number lies at index: "+i+","+j);
                }
            }
            System.out.println(" ");
        }
    }
    
}