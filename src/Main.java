import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>(3);
        Add.addNumber(arr);
        Map<String,ArrayList<Integer>> items=new HashMap<>();
        items.put("k",arr);

        ArrayList<Integer> arr1=new ArrayList<>(3);
        Add.addNumber(arr1);
        items.put("t",arr1);
        System.out.println(items);
        System.out.println("Преобразовано в "+Add.intoSum((HashMap<String, ArrayList<Integer>>) items));

    }
}