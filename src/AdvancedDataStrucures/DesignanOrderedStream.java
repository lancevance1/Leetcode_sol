package AdvancedDataStrucures;

import java.util.ArrayList;
import java.util.List;

public class DesignanOrderedStream {
    int pointer;
    String[] arr;
    List<String> res;

    public DesignanOrderedStream(int n) {
        this.arr = new String[n];
        this.pointer = 0;
    }

    public List<String> insert(int idKey, String value) {
        this.res = new ArrayList<>();
        if (this.pointer == arr.length) return this.res;
        if (idKey - 1 == this.pointer) {
            arr[idKey - 1] = value;

            for (int i = idKey - 1; i < arr.length; i++) {
                if (arr[i] == null || arr[i].equals("")) break;
                res.add(arr[i]);
                this.pointer = i;
            }
            this.pointer++;
        } else if (idKey - 1 > this.pointer) {
            arr[idKey - 1] = value;
        }

        return this.res;
    }
}
