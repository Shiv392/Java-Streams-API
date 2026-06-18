package Easy/Problems;

import java.util.List;
import java.util.Arrays;

public class FirstNonRepeatingChar{
    public static void main(String[]args){
        String name = "salesforce";
        //chars() convert name into IntStream with their Unicode numeric value
        //like A-Z -> 65-90 a-z -> 97-122

        //first convert name into their IntStream then again convert  using chars()
        //stream element into their char form using mapToObj
        char FirstNonRepeatChar = name.chars().mapToObj(c-> (char)c)
        .filter(c-> name.indexOf(c)==name.lastIndexOf(c))
        .findFirst().orElse(null);

        System.out.println("First non repeating character: "+FirstNonRepeatChar);

        //output : a
    }
}