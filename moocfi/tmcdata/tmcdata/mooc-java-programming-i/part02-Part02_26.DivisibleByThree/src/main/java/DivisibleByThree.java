
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=Integer.valueOf(scanner.nextLine());
        int b=Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(a,b);
    }
    public static void divisibleByThreeInRange(int b, int e){
        for(int i=b;b<=e;b++){
            if(b%3==0){
                while(b<=e){
                    System.out.println(b);
                    b=b+3;
                }
            }

        }
        
        
           
            
        

        
       

    }

}
