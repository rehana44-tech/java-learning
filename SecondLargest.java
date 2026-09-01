class SecondLargest{
    public static void main(String[] args) {
    int[] array={12,5,8,20,15};
    int largest=array[0];
    int secondlargest=array[0];
    for(int i=0;i<5;i++){
       if(array[i]>largest){
        secondlargest=largest;
         largest=array[i];
       }
       else if(array[i]>secondlargest){
        secondlargest=array[i];
       }

    }
    System.out.println(secondlargest);

}
}