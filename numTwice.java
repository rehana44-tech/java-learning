class numTwice{
    public static void main(String[] args) {
        int arr[]={2,3,3,5,2,7};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        int mask=xor &-xor;
        int first=0;
        int second=0;
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] & mask) != 0) {
                first = first ^ arr[i];
            } else {
                second = second ^ arr[i];
            }
        }

        System.out.println(first);
        System.out.println(second);

    }
}