class mergeSort{
    public static void conquer(int a[],int s,int mid,int e){
        int merged[]=new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=e){
            if(a[idx1]<=a[idx2]){
                merged[x++]=a[idx1++];
            }
            else{
                merged[x++]=a[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=a[idx1++];
        }
        while(idx2<=e){
            merged[x++]=a[idx2++];
        }
        for(int i=0,j=s;i<merged.length;i++,j++){
                a[j]=merged[i];
        }
    }
    public static void divide(int a[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        divide(a,s,mid);
        divide(a,mid+1,e);
        conquer(a,s,mid,e);
    }
    public static void main(String[] args){
        int a[]={3,4,2,1,7,6};
        int n=a.length;
        divide(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
}