class bubbleSort{
    public static void main(String[]args){
        int a[]={3,6,8,2,7};
        int count=0;
        for(int i=0;i<a.length-1;i++){       
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
        }
        System.out.println(count);
            System.out.println(" ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println(" ");
    }
}