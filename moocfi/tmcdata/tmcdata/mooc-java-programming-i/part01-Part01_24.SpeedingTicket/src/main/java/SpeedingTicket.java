
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Give speed:");
      int a=Integer.valueOf(s.nextLine());
      if(a>120)
      {
         System.out.println("Speeding ticket!");
      }


        
    }
}
