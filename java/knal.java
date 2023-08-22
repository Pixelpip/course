import java.util.*;
public class knal{
    public static void main(String[] args){
        int a=57;
        System.out.println(a%2==1);
        int x=3;
        int y=6;
        String s=Integer.toBinaryString(~x&y|x&~y);
        String n=Integer.toBinaryString(~x);
        System.out.println("binary of x:"+Integer.toBinaryString(x));
        System.out.println("Binary of y:"+Integer.toBinaryString(y));
        System.out.println("x|y:"+Integer.toBinaryString(x|y));
        System.out.println("x&y:"+Integer.toBinaryString(x&y));
        System.out.println("x^y:"+Integer.toBinaryString(x^y));
        System.out.println("~x&y |x&~y:"+s);
        System.out.println("~x:"+Integer.toBinaryString(~x));
        System.out.println(n.length());
        
        
        
        
    }
}