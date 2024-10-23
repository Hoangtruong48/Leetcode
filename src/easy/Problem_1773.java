package easy;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        ArrayList<String> lists = new ArrayList<>();
        Set<String> set = Stream.of("color", "type", "name").collect(Collectors.toSet());
        if (!set.contains(ruleKey)) {
            return 0;
        }
        if ("type".equals(ruleKey)){
            for (List<String> item : items) {
                lists.add(item.get(0));
            }
        } else if ("color".equals(ruleKey)) {
            for (List<String> item : items) {
                lists.add(item.get(1));
            }
        } else {
            for (List<String> item : items) {
                lists.add(item.get(2));
            }
        }
        int count = 0;
        for (String list : lists) {
            if (ruleValue.equals(list)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
