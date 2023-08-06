
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> s=new ArrayList<>();
        s.add("First");
        s.add("Second");
        s.add("Third");
        System.out.println(s);
        removeLast(s);
        removeLast(s);
        System.out.println(s);
    }
    public static void removeLast(ArrayList<String> i){
        if(i.size()<=1){
            
        }else{
            i.remove(i.size()-1);
        }
    }

}
