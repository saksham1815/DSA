class Solution {
    public void reverseString(char[] s) {
        int l = 0 ;
        int r = s.length-1;
        reverse(s , l ,r);

    }
    void reverse(char[] s , int start , int end){
        if(start>=end){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end]  =temp;
        reverse(s , start+1  , end -1);
    }
}