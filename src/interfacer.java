interface dog{
    final String nikhil="**";
    abstract void sum2();
}
public class interfacer implements dog {
    public void sum2(){
        System.out.println("Sum abstract methode");
    }
    void hello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        interfacer ob=new interfacer();
        ob.sum2();
        ob.hello();
    }
}
