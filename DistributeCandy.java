public class Solution {
    public int candy(ArrayList<Integer> A) {
        int n = A.size();
        int candies[] = new int[n];
        for(int i=0;i<n;i++){
            candies[i]=1;
        }
        for(int i=1;i<n;i++){
            if(A.get(i)>A.get(i-1)){
                candies[i] = candies[i-1]+1;
            }
        }
        int sum  = candies[n-1];
        for(int i=n-2;i>=0;i--){
            if(A.get(i)>A.get(i+1)){
                candies[i] = Math.max(candies[i],candies[i+1]+1);
            }
            sum+=candies[i];
        }
        return sum;
    }
}
