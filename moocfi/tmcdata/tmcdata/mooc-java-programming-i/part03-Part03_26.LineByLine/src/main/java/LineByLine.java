
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] p=s.split(" ");
        if(p.equals(" ")){
        }else{
            for(int i=-1;i<p.length;i++){
                for(int j=0;j<p.length;j++)
                    System.out.println(p[j]);
                if(s.equals(" ")){

                }else{
                    s=scanner.nextLine();
                    p=s.split(" ");
                }
            }
            
        }
        
    }
}
