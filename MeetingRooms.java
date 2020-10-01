public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer>B = new ArrayList<>();
        ArrayList<Integer>C = new ArrayList<>();
        int n = A.size();
        for(int i=0;i<n;i++){
            B.add(A.get(i).get(0));
            C.add(A.get(i).get(1));
        }
        Collections.sort(B);
        Collections.sort(C);
        int req = 1;
        int i = 1;
        int j = 0;
        int max = 1;
        while(i<n && j<n){
            if(B.get(i)<C.get(j)){
                req++;
                i++;
            }
            else{
                req--;
                j++;
            }
            max = Math.max(max,req);
        }
        return max;
    }
}
