package Module6;

public class DifferenceArray {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n];
        int l = 1,r = 3,val = 5;
        diff[l] += val;
        if(r+1<n) diff[r+1] -= val;
        int[] res = new int[n];
        res[0] = diff[0];
        for(int i=1; i<n; i++)
            res[i] = res[i-1]+diff[i];
        for(int x:res) System.out.print(x+" ");
    }
}