
    public class Solution {
        public int bulbs(ArrayList<Integer> A) {
            int ans = 0;
            for(int i=0;i<A.size();i++){
                int temp = A.get(i);
                if(ans%2 == 1){
                    if(temp == 1)temp = 0;
                    else temp = 1;
                }
                if(temp == 0){
                    ans++;
                }
            }
            return ans;
        }
    }

