package Module6;

import java.util.*;
public class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] a={1,2,3,1,1,1,1};
        int k=3,sum=0,max=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k) max=i+1;
            if(m.containsKey(sum-k)) max=Math.max(max,i-m.get(sum-k));
            if(!m.containsKey(sum)) m.put(sum,i);
        }
        System.out.println(max);
    }
}