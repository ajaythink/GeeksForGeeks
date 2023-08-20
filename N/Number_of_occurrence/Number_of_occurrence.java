
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int cnt = 0;
        for(int ele : arr){
            if(ele == x){
                cnt++;
            }
        }
        return cnt;
    }
}
