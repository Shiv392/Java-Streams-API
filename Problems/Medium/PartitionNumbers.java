//program to partition numbers with event and odd vlaue 

package Medium/Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionNumbers{
    public static void main(String[]args){
        List<Integer>list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>>ans = list.stream().
        collect(Collectors.partitioningBy(n-> n%2==0));

        System.out.println(ans);

        // {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8]}
    }
}