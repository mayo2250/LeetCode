class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lc=0,rc=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L') lc++;
            if(moves.charAt(i)=='R') rc++;
        }
        return (Math.abs(lc-rc)+n-lc-rc);
    }
}