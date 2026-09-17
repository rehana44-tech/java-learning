class Bits{
    public static void main(String[] args){
        int n=5;
        int pos=2;
       int bitMask=1<<pos;
       //get bit 
    //    if((bitMask & n)==0){
    //     System.out.println("bit is zero");
    //    }
    //    else{
    //     System.out.println("bit is 1");
    //    }
        int notBitmask=~(bitMask);
         int newNumber=notBitmask &n;
         System.out.println(newNumber);
    }
}