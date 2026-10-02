package Strings;

public class StringBuilders {

    public static void main(String[] args) {
       String a="Sudhir";
        StringBuilder sb=new StringBuilder(a);
        sb.append(" Hiii");
        sb.reverse();
        sb.deleteCharAt(1);


        System.out.println(sb);
    }
}
