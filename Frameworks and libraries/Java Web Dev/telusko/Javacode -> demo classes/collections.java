import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class collections {
    public static void main(String args[]) {
        // Collection<Integer> values = new ArrayList<Integer>();
        // // Collection<Integer> values = new ArrayList<>();
        // values.add(5);
        // values.add(15);
        // values.add(25);

        // List<Integer> l = new collections();

        // for (Object i : values) {
        // System.out.println((Integer) i);
        // }

        // Collection<Integer> nums = new TreeSet<Integer>();
        // nums.add(62);
        // nums.add(54);
        // nums.add(82);
        // nums.add(21);

        // // nums.add("5");

        // Iterator<Integer> it = nums.iterator();

        // while (it.hasNext())
        // System.out.println(it.next());

        List<Integer> values = Arrays.asList(4, 5, 6, 3, 5);
        int result = values.stream().filter(n -> n % 2 == 0).reduce(0,(a,b) -> a+b);
        System.out.println(result);
            
        Predicate<Integer> p = new Predicate<Integer>(){
            public boolean test(Integer i){
                return i % 2 == 0;
            }         
        };
    }
}
