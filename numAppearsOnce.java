class numAppearsOnce{
    public static void main(String[] args) {
        int arr[]={2,3,5,3,5,2,7};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
        