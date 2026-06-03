package Problems.Easy;

import java.util.stream.Stream;

public class CountGreaterTen {
    public static void main(String[] args) {
        //program to count the number of element in the streams whose value is greater then 10
        long count = Stream.of(10,20,1,20,4,50).filter(ele-> ele>10).count();
        System.out.println("Numbers greather then 10: "+ count);
    }
}
