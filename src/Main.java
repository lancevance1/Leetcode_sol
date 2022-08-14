import DynamicProgramming.CombinationSumIV;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<List<Integer>> res = ThreeSumDev.threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
//
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.println(res.get(i).get(j));
//            }
//        }


//    int res = ThreeSumCloset.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
//
//        System.out.println(res);

//{-3,-2,-1,0,0,1,2,3}
//        List<List<Integer>> res = FourSum.fourSum(new int[]{0,0,0,0},0);
//
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println("?????");
//
//        }
//
//    }
//
//        int[] arr;
//        int[] input = {5,5,5,7};
//        arr = SearchRange.searchRange(input, 5  );
//
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//
//        }


//        ImplementstrStr rep = new ImplementstrStr();
//        String s = "aabcaabxaaaz";
//        int[]arr =new int[s.length()];
//
//        arr = rep.zArray(s);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        int[] arr={7,6,5,4,3,2,1};
//        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
//        int[] arr={7,6,5,4,3,2,1};
//        Algorithm.Sort test = new Algorithm.Sort();
//        test.mergeSort(arr,0,arr.length-1);
//        test.quicksort(arr,0,arr.length-1);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        System.out.println(MaximumSubarray.maxSubArray(arr));

//        Heap heap = new Heap();
//        int[] res = heap.heapSort(arr);
//        test.insertSort(arr);
//        test.bubleSort(arr);
//        TopKFrequentElements test1 = new TopKFrequentElements();
//
//              int[] arr={-1,1,4,-4,3,5,4,-2,3,-1};
//              int k =3;
//        int [] ans = test1.topKFrequent(arr,k);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }

//    LinkList list = new LinkList(1);
//    list.push(3);
//        list.push(2);
//        list.push(4);
//
//        list.printList();
////       LinkList.Node node =  list.searchNode(4);
////       System.out.println(node.previous.data);
//list.deleteNode(3);
//
//        list.deleteNode(2);
//        list.deleteNode(1);
//        list.deleteNode(4);
//        list.printList();
//    }
//        FindWinneronaTicTacToeGame f =new FindWinneronaTicTacToeGame();
//        int[][] arr = new int[][]{{0,2},{1,0},{2,2},{1,2},{2,0},{0,0},{0,1},{2,1},{1,1}};
//        System.out.println(f.tictactoe(arr));
//        ReverseLinkedList.ListNode node1 = new ReverseLinkedList.ListNode(1);
//        ReverseLinkedList.ListNode node2 = new ReverseLinkedList.ListNode(2);
//        ReverseLinkedList.ListNode node3 = new ReverseLinkedList.ListNode(3);
//        node1.next =node2;
//        node2.next = node3;
//        System.out.println(node1);
//        System.out.println(node2);
//        System.out.println(node3);
//        while(node3!=null){
//            System.out.println(node3.val);
//        node3=node3.next;
//    }
//        int [][] arr = {{1,2},{0,1}};
//        SnakeGame test = new SnakeGame(3,2,arr);
//        //["R"], ["D"], ["R"], ["U"], ["L"], ["U"]
//        String[] moveList ={"R","D","R","U","L","U"};
//        for (int i = 0; i < moveList.length; i++) {
//              test.move(moveList[i]);
//        }

//    int[] test = {1,2,3,4};
//    DivideArrayIntoEqualPairs test1 = new DivideArrayIntoEqualPairs();
//    boolean a = test1.divideArray(test);
//

//        int[] ar = {3, 19, 8, 1};
//        MinimumOperationsToHalveArraySum test = new MinimumOperationsToHalveArraySum();
//        int res = test.halveArray(ar);


//        String s = "a";
//        String p = "zz";
//        MaximizeNumberofSubsequencesinaString t = new MaximizeNumberofSubsequencesinaString();
//        t.maximumSubsequenceCount(s,p);


//        int[][] test = new int[3][2];
//        System.out.println(test[0].length + " " + test.length);


//        FindPalindromeWithFixedLength t = new FindPalindromeWithFixedLength();
//        int[] arr = new int[]{1};
//        long[] res= t.kthPalindrome(arr,1);

//        Stack<Integer> s = new Stack<>();
//        s.pop();
//        System.out.println();

//        for(long r: res){
//            System.out.println(r);
//        }

//        class Solution {
//            public int minimumNumbers(int num, int k) {
//                int res = 0;
//                if (num == 0) return 0;
//                if (num < k) return -1;
//                if (num == k) return 1;
//                String s = String.valueOf(num);
//                int unit = (int) (s.charAt(s.length() - 1) - '0');
//                if (unit == k) return 1;
//                if (k == 0) {
//                    if (unit != 0) return -1;
//                }
//                int[] helper = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//                List<Map> list = new ArrayList();
//                for (int i = 0; i < helper.length; i++) {
//                    Map<Integer, Integer> map = new HashMap<>();
//
//                    for (int j = 0; j < helper.length; j++) {
//                        int tmp = helper[i] * helper[j];
//                        String tmps = String.valueOf(tmp);
//                        int tmpUnit = (int) (tmps.charAt(tmps.length() - 1) - '0');
//                        if (!map.containsKey(tmpUnit))
//                            map.put(tmpUnit, j);
//                    }
//                    list.add(map);
//                }
//
//                var m = list.get(k - 1);
//                res = (int) m.getOrDefault(unit, -1);
//                return num / k < res ? -1 : res;
//
//
//            }
//        }
//        Solution s = new Solution();
//        var res = s.minimumNumbers(10, 2);

//        CountofSmallerNumbersAfterSelf c = new CountofSmallerNumbersAfterSelf();
//        List<Integer> res = c.countSmaller(new int[]{5,2,6,1});
//        CombinationSumIV t = new CombinationSumIV();
//        var res = t.combinationSum4(new int[]{1,2,3},32);
//        System.out.println(res);

//        class Solution {
//            public int[][] largestLocal(int[][] grid) {
//                int[][] res = new int[grid.length-2][grid[0].length-2];
//                for(int i=1;i<grid.length-1;i++){
//                    for(int j=1;j<grid[0].length-1;j++){
//                        int max=0;
//                        for(int k=i-1;k<3+i-1;k++){
//                            for(int l=j-1;l<3+j-1;l++){
//                                max=Math.max(max,grid[k][l]);
//                            }
//                        }
//                        res[i-1][j-1]=max;
//                    }
//                }
//
//
//
//                return res;
//            }
//        }
//
//        Solution t = new Solution();
//        t.largestLocal(new int[][]{{20,8,20,6,16,16,7,16,8,10},{12,15,13,10,20,9,6,18,17,6},{12,4,10,13,20,11,15,5,17,1},{7,10,14,14,16,5,1,7,3,11},{16,2,9,15,9,8,6,1,7,15},{18,15,18,8,12,17,19,7,7,8},{19,11,15,16,1,3,7,4,7,11},{11,6,5,14,12,18,3,20,14,6},{4,4,19,6,17,12,8,8,18,8},{19,15,14,11,11,13,12,6,16,19}});
        class Solution {
            LinkedList<Integer> edge = new LinkedList<>();
            Map<Integer, Integer> m;
            List<LinkedList<Integer>> ret = new ArrayList<>();

            public String smallestNumber(String pattern) {
                String res = "123456789";
                char[] arr = pattern.toCharArray();

                int[] temp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                m = new HashMap<>();
                dfs(arr, temp, -1);
                String s = "";
                for (var c : ret.get(0)) {
                    s += String.valueOf(c);
                }
                return s;
            }
            boolean find = false;
            private boolean check(char[] arr, int[] temp, int x, int y) {
                int val = 0;
                if (y == -1) return true;
                if (edge.peekLast() != null) val = edge.peekLast();
                if (arr[y] == 'D') {
                    if (edge.peekLast() != null) {
                        if (val < x) return false;
                    }
                } else {
                    if (edge.peekLast() != null) {
                        if (val > x) return false;
                    }
                }
                return true;
            }

            private void dfs(char[] arr, int[] temp, int y) {
                if (ret.size() == 1) {
                    return;
                }
                if (edge.size() == arr.length + 1) {
                    ret.add(new LinkedList<>(edge));
                    find = true;
                    return;
                }
                for (int i = 1; i <= arr.length + 1; i++) {
                    if(find)return;
                    if (m.containsKey(i)) {
                        continue;
                    }
                    if (!check(arr, temp, i, y)) continue;
                    edge.add(i);
                    m.put(i, 1);
                    dfs(arr, temp, y + 1);

                    edge.removeLast();
                    m.remove(i);
                }
            }
        }

        Solution s = new Solution();
        String ret = s.smallestNumber("DDD");
        System.out.println(ret);
    }
}
