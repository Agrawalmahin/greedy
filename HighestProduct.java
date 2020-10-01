

    public class Solution {
        public int maxp3(ArrayList<Integer> A) {
            Collections.sort(A);
            int pro1 = 0;
            int pro2 = 0;
            int pro3 = 0;
            int max = 0;
            if(A.size()>=3){
                int n = A.size();
                pro1 = A.get(0)*A.get(1)*A.get(2);
                pro2 = A.get(0)*A.get(1)*A.get(n-1);
                pro3 = A.get(n-1)*A.get(n-2)*A.get(n-3);
                 max = Math.max(pro1,Math.max(pro2,pro3));
            }
            return max;
        }
    }

