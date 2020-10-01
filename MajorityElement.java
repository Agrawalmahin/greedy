public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int max = 1;
        Collections.sort(A);
        int count = 1;
        int ele = A.get(0);
        for(int i=1;i<A.size();i++){
            int temp1 = A.get(i);
            int temp2 = A.get(i-1);
            if(temp1 == temp2){
                count++;
            }
            else{
                count = 1;
            }
            if(count>max){
                max = count;
                ele = A.get(i);
            }
        }
        return ele;
    }
}
