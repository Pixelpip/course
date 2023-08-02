
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        int j=list.size()-1;
        System.out.println("Search for?");
        String s=scanner.nextLine();
        for(String i:list){
            if(s.equals(i)){
                System.out.println(i+" was found!");
                break;
            }else if(i.equals(list.get(j))){
                System.out.println(i+" was not found!");
            }
        }

    }
}
