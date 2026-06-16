//programe to find duplicates numbers from the given input / list

package Easy/Problems;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Integer>list = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 1);

     //here duplicates are 2, 3, 1
     //login : we have to keep track of already visited element, so we can use hashset
     //now if hashSet(element) : return false i.e element is already present;
     
     Set<Integer>seen = new HashSet<>();
     List<Integer>duplicateList = list.stream().filter(num-> !seen.add(num)).toList();
     duplicateList.forEach(num-> System.out.print(num+" "));
    }
}