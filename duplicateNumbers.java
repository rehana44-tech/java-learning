class duplicateNumbers{
    public static void main(String[] args) {
        int array[]={4,7,2,4,9,7,1};
         boolean check=false;
        for(int i=0;i<7;i++){
        int count=0;
        for(int j=0;j<7;j++){
            if(array[i]==array[j]){
                count++;
                check=true;
            }
        }
        if(count>1 && !check){
            System.out.println(array[i]);
        }
        }
    }
}