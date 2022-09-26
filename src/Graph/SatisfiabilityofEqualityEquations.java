package Graph;

import AdvancedDataStrucures.DisjointSet;

public class SatisfiabilityofEqualityEquations {
    //tc:o(n*alpha(n));sc:o(c) where c is the 26 lower case characters
    public boolean equationsPossible(String[] eq) {
        DisjointSet ds = new DisjointSet(26);
        for (int i = 0; i < 26; i++) {
            ds.setParent(i);
        }
        for (String value : eq) {
            if (value.charAt(1) == '=') {
                ds.union(value.charAt(0) - 'a', value.charAt(3) - 'a');
            }
        }
        for (String s : eq) {
            if (s.charAt(1) == '!') {
                if (ds.find(s.charAt(0) - 'a') == ds.find(s.charAt(3) - 'a')) return false;
            }
        }
        return true;
    }
}
