import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        array1.add("1");
        array1.add("2");
        array1.add("3");
        array2.add("3");
        array2.add("4");
        array2.add("5");
        String message = "sem elementos em comum!";
        for (int i = 0; i < array1.size();i++){
            if(array2.contains(array1.get(i))){
                message = "contém elementos em comum!";
            }
        }
        System.out.println(message);


       
       
    }
}
