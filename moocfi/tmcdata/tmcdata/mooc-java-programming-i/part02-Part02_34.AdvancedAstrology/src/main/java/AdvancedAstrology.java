
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i=0;i<number;i++){
            System.out.print("*");
        }
        
    }

    public static void printSpaces(int number){
        // part 1 of the exercise
        int i=number;
        while(i>0){
            System.out.print(" ");
            i--;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int z=1;
        for(int i=size;i>=1;i--){
            printSpaces(i-1);
            printStars(z);
            z++;
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
       int z=1;
       int b=2;
        for(int i=height;i>=1;i--){
            printSpaces(i-1);
            printStars(z);
            printStars(b);
            System.out.println("");
            z++;
            b++;
        }
        for(int i=0;i<2;i++){
            printSpaces((height/2)+1);
            printStars(3);
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
