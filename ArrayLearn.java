import java.util.*;
class ArrayLearn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int x=7;
        boolean found=false;
        for(int i=0;i<size;i++){
            if(array[i]==x){
                System.out.println("the element lies in index: "+i);
                found=true;
            }
        }
        if(found==false){
            System.out.println("Element not found");
        }
            
    
        


        }
       
    }