
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
                for(int j=0;j<p.length;j++)
                    System.out.println(p[j]);
                s=scanner.nextLine();
                p=s.split(" ");
                if(s.equals("")){
                    System.out.print("halted");
                    break;
                }
            }
        }

    }
}
