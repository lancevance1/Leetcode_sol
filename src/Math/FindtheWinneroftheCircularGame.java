package Math;

import java.util.ArrayList;

public class FindtheWinneroftheCircularGame {
    //tc:o(n^2);sc:o(n)
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n; i++) al.add(i);
        int index = 0;
        while (al.size() > 1) {
            index = (index + k - 1) % (al.size());
            al.remove(index);
        }
        return al.get(0);
    }
}
