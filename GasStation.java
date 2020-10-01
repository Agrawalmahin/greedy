public class Solution {
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
        int n = A.size();
        if(n == 1) return 0;
        else{
            long sum = 0;
            long diff = 0;
            int start = 0;
            for(int i=0;i<n;i++){
                sum+=A.get(i)-B.get(i);
                if(sum<0){
                    start = i+1;
                    diff+=sum;
                    sum = 0;
                }
            }
            return sum+diff>=0?start:-1;
        }
    }
}
