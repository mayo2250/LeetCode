class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int a1 = rec1[0], a2 = rec1[1], a3 = rec1[2], a4 = rec1[3], b1 = rec2[0], b2 = rec2[1], b3 = rec2[2], b4 = rec2[3];
        // boolean res = false;
        // if(a1==b1 && a2==b2 && a3==b3 && a4==b4) return true;
        // if(b1>a1 && b1<a3 && b2>a2 && b2<a4 && b3>a1 && b3<a3 && b2>a2 && b2<a4 && b1>a1 && b1<a3 && b4>a2 && b4<a4 && b3>a1 && b3<a3 && b4>a2 && b4<a4) return true;
        // if(a1>=b1 && a1<=b3 && a2>=b2 && a2<=b4) return true;
        // if(a3>=b1 && a3<=b3 && a2>=b2 && a2<=b4) return true;
        // if(a1>=b1 && a1<=b3 && a4>=b2 && a4<=b4) return true;
        // if(a3>=b1 && a3<=b3 && a4>=b2 && a4<=b4) return true;
        if(a1 >= b3 || b1 >= a3) return false;
        if(a2 >= b4 || b2 >= a4) return false;

        return true;
    }
} 