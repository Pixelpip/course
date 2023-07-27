
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int r=0;
        int i=0;
        while(true){
            int a=Integer.valueOf(scanner.nextLine());
            if(a==-1){
                System.out.println("Thx!Bye!");
                break;
            }
            r=r+a;
            i++;
        }
        System.out.println("Sum:"+r);
        System.out.println("Numbers:"+i);

    }
}
