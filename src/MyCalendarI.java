import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyCalendarI {
//    TreeMap<Integer,Integer> m;
//    public MyCalendarI() {
//        m=new TreeMap();
//    }
//
//    //tc:o(logn)
//    public boolean book(int start, int end) {
//        var a = m.ceilingKey(start);
//        var b = m.floorKey(start);
//
//        if((b==null||m.get(b)<=start)&&(a==null||end<=a)){
//
//            m.put(start,end);
//            return true;
//        }
//
//        return false;
//    }
    TreeSet<int[]> calendars;
    public MyCalendarI() {
        TreeSet calendars = new TreeSet<int[]>((a, b) -> {
        if(a[1] <= b[0])
            return -1;
        else if(a[0] >= b[1])
            return 1;
        else
            return 0;
    });
}

    public boolean book(int start, int end) {
        int[] e = new int[]{start, end};
        return calendars.add(e);
    }
}
