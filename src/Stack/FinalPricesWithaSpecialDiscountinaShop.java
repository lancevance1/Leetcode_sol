package Stack;

import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop {
    //tc:o(n);sc:o(n)
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        Stack<Integer> s = new Stack();
        for (int i = prices.length - 1; i > -1; i--) {
            while (s.size() != 0 && s.peek() > prices[i]) {
                s.pop();
            }
            res[i] = s.size() == 0 ? prices[i] : prices[i] - s.peek();
            s.push(prices[i]);
        }
        return res;
    }
}
