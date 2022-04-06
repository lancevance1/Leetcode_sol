import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // tc: o(numRows^2), sc:o(numRows)
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            row.add(1);
            if (i > 1) {
                List<Integer> tmp = res.get(i - 1);
                for (int j = 1; j < res.get(i - 1).size() ; j++) {
                    row.add(tmp.get(j) + tmp.get(j - 1));
                }
            }
            if (i > 0) {
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}
