package Methods;

public class Arguments {
    public static void sum(int a,int b){
        if (a>b){
            System.out.println("a is grater");
        }
        else
        {
            System.out.println("b is grater");
        }

    }
    public static void max(int a,int b){
        int c=a+b;
        System.out.println("The sum is: "+c);
    }

    public static void main(String[] args) {
        sum(5,6);
        max(4,6);

    }
}
