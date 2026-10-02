package Basics_java;

import java.util.Locale;

public class CompareToFunction {
    public static void main(String[] args) {
        String a="Sudhir";
        String b="Kumar";
        for(int i=0;i<a.length();i++){
            for (int j = i; j <a.length() ; j++) {
                System.out.print(a.substring(i,j)+" ");

            }
            System.out.println();
        }
//        double c=3.14;
//        a=a+c;
//        System.out.println(a);

    }
}
