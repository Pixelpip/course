
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        
        while(0<number){
            System.out.print("*");
            number--;
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        
            for(int i=number;i>=1;i--){
                System.out.print(" ");
            }
            
            
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int z=1;
        for(int i=size;i>=1;i--){
            printSpaces(i);
            printStars(z);
            z++;
            System.out.println("\n");
        }
            
            
        
        
        
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
