package TCS_Practice;
import java.util.*;
class binaryDecimaltogle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Decimal number: ");
        int num=sc.nextInt();
        String bin="";
        while(num!=0){
            bin=(num%2)+bin;
            num=num/2;
        }
        String tog="";
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch=='0'){
                tog=tog+"1";
            }else{
                tog=tog+"0";
            }
        }
        int binary=Integer.parseInt(tog);
        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }
        System.out.println("Binary: "+ bin);
        System.out.println("After togle: "+ tog);
        System.out.println("Final Answer:"+decimal);
    }
}
