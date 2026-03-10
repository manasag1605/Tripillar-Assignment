package Module7;

public class BinarySearch{
    static int iterative(int[] a,int x){
        int l=0,r=a.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x) return m;
            if(a[m]<x) l=m+1;
            else r=m-1;
        }
        return -1;
    }

    static int recursive(int[] a,int l,int r,int x){
        if(l>r) return -1;
        int m=(l+r)/2;
        if(a[m]==x) return m;
        if(a[m]<x) return recursive(a,m+1,r,x);
        return recursive(a,l,m-1,x);
    }

    public static void main(String[] args){
        int[] a={1,2,3,4,5,6};
        System.out.println(iterative(a,4));
        System.out.println(recursive(a,0,a.length-1,4));
    }
}