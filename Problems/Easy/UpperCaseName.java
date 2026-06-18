package Easy/Problems;

//convert each name of the list into their upper case formate

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseName{
    public static void main(String[]args){
        List<String>names = Arrays.asList("Google", "Microsoft", "Salesforce", "Amazon", "Paypal");

        List<String>upperCaseNames = names.stream().map(name-> name.toUpperCase()).
        collect(Collectors.toList());

        upperCaseNames.forEach(name-> System.out.print(name+" "));

    }
}