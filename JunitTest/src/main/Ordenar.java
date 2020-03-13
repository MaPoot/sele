import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenar {
    public List<Integer> ordenar(int [] data){
        List<Integer> data_list = new ArrayList<>();

        for (int num : data){
            data_list.add(num);
        }

        Collections.sort(data_list);

         return data_list;
    }
}
