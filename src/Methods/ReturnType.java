package Methods;

public class ReturnType {
    public static int sudhir(){
        System.out.println("Hii here is return type Persion");
        return 5;
    }
    public static int max(int a,int b,int c){
        if (a>=b && a>=c) return a;
        else if (b>=a && b>=c)return b;
        else return c;

    }

    public static void main(String[] args) {
//        int x=(4+sudhir());
//
//        sudhir();
        System.out.println(  max(34,45,56));

    }
}
