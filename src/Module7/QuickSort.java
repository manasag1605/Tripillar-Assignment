package Module7;

import java.util.*;
public class QuickSort{

    static int partition(int[] a,int l,int r){
        int p=a[r];
        int i=l-1;

        for(int j=l;j<r;j++){
            if(a[j]<p){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }

        int t=a[i+1];
        a[i+1]=a[r];
        a[r]=t;

        return i+1;
    }

    static void sort(int[] a,int l,int r){
        if(l<r){
            int pi=partition(a,l,r);
            sort(a,l,pi-1);
            sort(a,pi+1,r);
        }
    }

    public static void main(String[] args){
        int[] a={5,3,8,4,2};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}