package Module7;

public class FirstLastOccurrence{
    static int first(int[] a,int x){
        int l=0,r=a.length-1,res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){res=m;r=m-1;}
            else if(a[m]<x) l=m+1;
            else r=m-1;
        }
        return res;
    }

    static int last(int[] a,int x){
        int l=0,r=a.length-1,res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){res=m;l=m+1;}
            else if(a[m]<x) l=m+1;
            else r=m-1;
        }
        return res;
    }

    public static void main(String[] args){
        int[] a={1,2,2,2,3,4};
        System.out.println(first(a,2));
        System.out.println(last(a,2));
    }
}