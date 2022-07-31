import java.util.*;

public class NumberContainers {
    Map<Integer, Integer> m;
    Map<Integer, SortedSet<Integer>> m2;

    public NumberContainers() {
        m = new HashMap();
        m2 = new HashMap();
    }

    public void change(int index, int number) {

        m.put(index, number);
        if (m2.containsKey(number)) {
            m2.get(number).add(index);
        } else {
            SortedSet<Integer> s = new TreeSet<>();
            s.add(index);
            m2.put(number, s);
        }
    }

    public int find(int number) {
        if (!m2.containsKey(number)) return -1;
        var tmp = m2.get(number);
        return tmp.first();
    }
}
