class ReverseArray{
    public static void main(String[]args){
        int[] array={10,20,30,40,50};
        int newArray[]=new int[5];
        for(int i=4;i>=0;i--){
            newArray[i]=array[i];

        System.out.print(newArray[i]+",");
    }
}
}