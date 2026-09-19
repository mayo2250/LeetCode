class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // double scx = (x2-x1)/2;
        // double scy = (y2-y1)/2;
        // double cx = 
        int nx = Math.max(x1, Math.min(x2, xCenter));
        int ny = Math.max(y1, Math.min(y2, yCenter));
        if((Math.pow((nx-xCenter),2)+Math.pow((ny-yCenter),2))>radius*radius) return false;
        return true;
    }
}