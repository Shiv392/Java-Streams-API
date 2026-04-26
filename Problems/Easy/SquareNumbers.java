package Problems.Easy;

import java.util.List;
import java.util.stream.Stream;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer>list = List.of(1,2,3,4,5,6);

        Stream<Integer>squareStream = list.stream().map(num-> num*num);
        squareStream.forEach(num-> System.out.print(num+" "));
        System.out.println();

        //2. from direct stream vaue
        Stream.of(10,20,30,40,50).map(ele-> ele*ele).forEach(num-> System.out.print(num+" "));
        System.out.println();
    }
}
