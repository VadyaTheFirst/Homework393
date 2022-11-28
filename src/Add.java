import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Add {
    public static void addNumber(ArrayList<Integer> arr){
        for (int i = 0; i < 3; i++) {
            arr.add((Integer)(int) Math.round(Math.random()*100));
        }
    }

    public static Map<String,Integer>intoSum(HashMap<String,ArrayList<Integer>>  coll){
        Map<String,Integer> res=new HashMap<>();

        for (String s : coll.keySet()) {
            Integer sum = 0;{

                var a = coll.get(s).toArray();
                for (int i = 0; i < a.length; i++) {
                    sum = sum+(Integer) a[i];
                }

            }
            res.put(s,sum);
        }

        return res;
    }
}
