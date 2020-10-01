
    public class Solution {
        public int seats(String A) {
            int m = 10000003;
            ArrayList<Integer>arr = new ArrayList<>();
            for(int i = 0;i<A.length();i++){
                if(A.charAt(i) == 'x'){
                    arr.add(i);
                }
            }
            int n = arr.size();
            int ans = 0;
            int mid = n/2,k = 1;
            for(int i = mid-1;i>=0;i--){
                ans = (ans+arr.get(mid)-k-arr.get(i))%m;
                k++;
            }
            k = 1;
            for(int i = mid+1;i<n;i++){
                ans = (ans+arr.get(i)-arr.get(mid)-k)%m;
                k++;
            }
            return ans%m;
        }
    }

