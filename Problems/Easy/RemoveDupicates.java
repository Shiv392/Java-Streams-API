package Problems.Easy;

import java.util.Arrays;
import java.util.List;

public class RemoveDupicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,3};
        List<Integer>UniqueList = Arrays.stream(arr).distinct().boxed().toList();
        UniqueList.forEach(ele-> System.out.print(ele+" "));

        //first element from the stream
        int firstNum = Arrays.stream(arr).findFirst().getAsInt();
        System.out.println("First element: "+firstNum);
    }
}
