package Module6;

public class PairsWithTargetSum {
    public static void main(String[] args) {
        int[] a={1,4,5,6,3,2};
        int target=7;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target)
                    System.out.println(a[i]+" "+a[j]);
            }
        }
    }
}