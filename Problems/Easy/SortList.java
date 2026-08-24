package Easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortList {
    public static void main(String[] args) {
        
        //create a sorted form of the list
        List<Integer>sortList = Stream.of(4,1,0,5,10).sorted().collect(Collectors.toList());
        sortList.forEach(num-> System.out.print(num+" "));
        System.out.println();

        //using toList();
        List<Integer>sortList2 = Stream.of(10,2,3,0,4,5).sorted().toList();
        sortList2.forEach(num-> System.out.print(num+ " "));
        System.out.println();
    }
}
