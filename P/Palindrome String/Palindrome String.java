class Solution {
    int isPalindrome(String s) {
        // code here
        // ----Frist Approach----
        // int ans = 0;
        // String demo = "";
        // for(int i=S.length()-1; i>=0; i--){
        //     demo+=S.charAt(i);
        // }
        // if(demo.equals(S)){
        //     return 1;
        // }
        // return ans;
        // ------Second Approach-----
        int ans = 0;
        int l = s.length() - 1;
        int j = 0;
        for (int i = l; i >= l / 2; i--) {

            if (s.charAt(l - (l - j)) == s.charAt(i)) {
                ans = 1;
            } else {
                return 0;
            }
            j++;
        }
        return ans;
    }
};
