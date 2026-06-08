import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class lambda {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 == 1;

        Consumer<Integer> printNumber = n -> System.out.println(n + "");

        System.out.println("Even numbers: ");


        for (int num : numbers){
            if (isEven.test(num)){
                printNumber.accept(num);
            }
        }

        System.out.println("Odd numbers: ");
        for (int numdar : numbers){
            if (isOdd.test(numdar)){
                printNumber.accept(numdar);
            }
        }
    }

}


//// THE OLD WAY (Anonymous Inner Class)
//// You have to explicitly type out the Comparator instantiation and method signature
//Collections.sort(names, new Comparator<String>() {
//    @Override
//    public int compare(String s1, String s2) {
//        return Integer.compare(s1.length(), s2.length());
//    }
//});
//
//// THE LAMBDA WAY
//// Java already knows it needs a Comparator, so you only write the raw logic
//        Collections.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

