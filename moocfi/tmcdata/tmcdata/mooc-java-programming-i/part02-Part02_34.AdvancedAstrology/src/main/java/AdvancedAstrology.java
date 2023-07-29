
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int c=0;
        while(c<number){
            System.out.print("*");
            c++;
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int c=0;
        while(c<number){
            for(int i=c;i>0;i--){
                System.out.print(" ");
            }
            
            c++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
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
