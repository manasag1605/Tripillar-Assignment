package Module6;

import java.util.*;
public class EvenIndexEvenNumber {
    public static void main(String[] args) {
        int[] a={3,6,12,1,5,8};
        int[] res=new int[a.length];
        int e=0,o=1;
        for(int x:a){
            if(x%2==0){
                res[e]=x;
                e+=2;
            } else{
                res[o]=x;
                o+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}