
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        if(s.equals(" ")){
            System.out.println("halted");
        }else{
            String[] p=s.split(" ");
            for(int i=0;i<p.length;i++){
                System.out.println(p[i]);
            }
        }

    }
}
