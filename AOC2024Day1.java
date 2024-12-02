import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AOC2024Day1 {
  public static void main(String args[]) {
   List<Integer> a = new ArrayList<>();
   List<Integer> b = new ArrayList<>();
   int i = 0;
   for (String input : args) {
       if (i%2 == 0) {
           b.add(Integer.valueOf(input));
       } else {
           a.add(Integer.valueOf(input));
       }
       i++;
   }
   Collections.sort(a);
   Collections.sort(b);
   int totalDistance = 0;
   for (int j = 0; j < a.size(); j++) {
       totalDistance = totalDistance + Math.abs((b.get(j) - a.get(j)));
   }
   System.out.println(totalDistance);
   
  }
}