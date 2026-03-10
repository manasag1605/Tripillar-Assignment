package Module7;

import java.util.*;
public class SelectionSort{
    public static void main(String[] args){
        int[] a={5,3,8,4,2};
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]) min=j;
            }
            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        System.out.println(Arrays.toString(a));
    }
}