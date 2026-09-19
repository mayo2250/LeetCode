class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        // int n = points.length;
        // int x1=0,x2=0,y1=0,y2=0;
        // int dx=0,dy=0;
        int res=0;
        for(int i=0;i<(points.length - 1);i++){
            // x1=points[i][0];
            // y1=points[i][1];
            // x2=points[i+1][0];
            // y2=points[i+1][1];

            // dx=Math.abs(x1-x2);
            // dy=Math.abs(y1-y2);

            // res+=Math.max(dx,dy);
            res+=Math.max(Math.abs(points[i][0] - points[i+1][0]),Math.abs(points[i][1] - points[i+1][1]));
        }
        return res;
    }
}