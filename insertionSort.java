class insertionSort{
    public static void main(String[]args){
        int a[]={3,6,8,2,7};
        for(int i=0;i<a.length;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[smallest]>a[j]){
                    int temp=a[smallest];
                    a[smallest]=a[j];
                    a[j]=temp;
                }
            }
        }

       //print array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println(" ");
    }
}