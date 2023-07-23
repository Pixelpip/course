
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i=0;
            double n=0;
            while(true){
                System.out.println("Give a number:");
                int a=Integer.valueOf(scanner.nextLine());
                if(a!=0){
                    if(a>0){
                        i=i+a;
                        n++; 

                      
                    }
                    continue;
                }else if(n==0&&a==0){
                    System.out.println("Cannot calulate the average");
                    break;
                }else if(a==0){
                    break;
                }
            }
            System.out.println(i/n);
    
        }
    }
    

