package Module6;

import java.util.*;
public class NegativeBeforePositive {
    public static void main(String[] args) {
        int[] a={3,-2,5,-1,6,-4};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}