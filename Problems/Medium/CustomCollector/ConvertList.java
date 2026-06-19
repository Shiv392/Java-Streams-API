package CustomCollector/Medium/Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ConvertList{
    public static void main(String[]args){
        List<String>names = Arrays.asList("Amazon", "Google", "Microsoft", "Zoom");
        //using built in 
        List<String>namesList = names.stream().collect(Collectors.toList());

        //using custom collector
        List<String>customNames = names.stream().collect(
            ArrayList::new,
            ArrayList::add,
            ArrayList::addAll
        );

        //ArrayList::new - > suplier --> ()-> new ArrayList<>();
        //Accumulator -> ArrayList::add -> (list, element)-> list.add(element);
        //Combiner -> ArrayList::addAll -> list1.addAll(list2);
    }
}