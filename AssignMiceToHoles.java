public class Solution {
    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        int max = 0;
        for(int i=0;i<A.size();i++){
            int temp = Math.abs(A.get(i)-B.get(i));
            max = Math.max(max,temp);
        }
        return max;
    }
}
