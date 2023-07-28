import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=Integer.valueOf(s.nextLine());
        printFromNumberToOne(a);

    }
    public static void printFromNumberToOne(int number){
        
        while(number>=1){
            System.out.println(number);
            number--;
        }


    }

}
