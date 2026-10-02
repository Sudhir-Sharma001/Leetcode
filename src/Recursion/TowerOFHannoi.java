package Recursion;

public class TowerOFHannoi {
    public static void main(String[] args) {
        hanoi(4,'A','B','C');
    }

    private static void hanoi(int n, char s, char h, char d) {
        if(n==0) return;
        //n-1 Ato b vai c
        hanoi(n-1,s,d,h);
        //largest source  to destination
        System.out.println(s+"->"+d);
        //n-1 disc from b to c vai a
        hanoi(n-1,h,s,d);
    }
}
