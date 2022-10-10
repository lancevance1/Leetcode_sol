import ArraryHashTable.SortArraybyIncreasingFrequency;
import BackTracking.PermutationsII;
import DynamicProgramming.BestTimetoBuyandSellStockIV;
import DynamicProgramming.CombinationSumIV;
import DynamicProgramming.MaximumScorefromPerformingMultiplicationOperations;
import Graph.BricksFallingWhenHit;
import Graph.CourseSchedule;
import Graph.PacificAtlanticWaterFlow;
import Intervals.MeetingRoomsIII;
import Tree.BinaryTreeVerticalOrderTraversal;
import Tree.BuildTree;
import Tree.TreeNode;

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


//        String.ImplementstrStr rep = new String.ImplementstrStr();
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

//        Heap.Heap heap = new Heap.Heap();
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

//    LinkedList.LinkList list = new LinkedList.LinkList(1);
//    list.push(3);
//        list.push(2);
//        list.push(4);
//
//        list.printList();
////       LinkedList.LinkList.Node node =  list.searchNode(4);
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
//        class Solution {
//            LinkedList<Integer> edge = new LinkedList<>();
//            Map<Integer, Integer> m;
//            List<LinkedList<Integer>> ret = new ArrayList<>();
//
//            public String smallestNumber(String pattern) {
//                String res = "123456789";
//                char[] arr = pattern.toCharArray();
//
//                int[] temp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//                m = new HashMap<>();
//                dfs(arr, temp, -1);
//                String s = "";
//                for (var c : ret.get(0)) {
//                    s += String.valueOf(c);
//                }
//                return s;
//            }
//            boolean find = false;
//            private boolean check(char[] arr, int[] temp, int x, int y) {
//                int val = 0;
//                if (y == -1) return true;
//                if (edge.peekLast() != null) val = edge.peekLast();
//                if (arr[y] == 'D') {
//                    if (edge.peekLast() != null) {
//                        if (val < x) return false;
//                    }
//                } else {
//                    if (edge.peekLast() != null) {
//                        if (val > x) return false;
//                    }
//                }
//                return true;
//            }
//
//            private void dfs(char[] arr, int[] temp, int y) {
//                if (ret.size() == 1) {
//                    return;
//                }
//                if (edge.size() == arr.length + 1) {
//                    ret.add(new LinkedList<>(edge));
//                    find = true;
//                    return;
//                }
//                for (int i = 1; i <= arr.length + 1; i++) {
//                    if(find)return;
//                    if (m.containsKey(i)) {
//                        continue;
//                    }
//                    if (!check(arr, temp, i, y)) continue;
//                    edge.add(i);
//                    m.put(i, 1);
//                    dfs(arr, temp, y + 1);
//
//                    edge.removeLast();
//                    m.remove(i);
//                }
//            }
//        }
//
//        Solution s = new Solution();
//        String ret = s.smallestNumber("DDD");
//        System.out.println(ret);
//        BuildTree b = new BuildTree();
//        var root = b.buildTree(new Integer[]{3,9,20,null,null,15,7});
//        BinaryTreeVerticalOrderTraversal test= new BinaryTreeVerticalOrderTraversal();
//        var res = test.verticalOrder(root);
//        System.out.println(res.toString());

//        BricksFallingWhenHit t = new BricksFallingWhenHit();
//        int[][] x=new int[][]{{1,0,0,0},{1,1,0,0}};
//        int[][] y=new int[][]{{1,1},{1,0}};
//       var res= t.hitBricks(x,y);
//        for(var c:res){
//            System.out.println(c);
//        }
//        class Solution {
//            public String shiftingLetters(String s, int[][] shifts) {
//                char[] arr = s.toCharArray();
//                int [] tmp = new int[arr.length+1];
//                for(var c:shifts){
//                    if(c[2]>0){
//                        tmp[c[0]]++;
//                        tmp[c[1]+1]--;
//                    }else{
//                        tmp[c[0]]--;
//                        tmp[c[1]+1]++;
//                    }
//                }
//                for(int i=1;i<tmp.length;i++){
//                    tmp[i]+=tmp[i-1];
//                }
//                for(int i=0;i<arr.length;i++){
//
//                    arr[i]=(char)(Math.floorMod(arr[i]-'a'+tmp[i], 26)+'a');
//                }
//                return String.valueOf(arr);
//            }
//        }
//        Solution s= new Solution();
//        s.shiftingLetters("abc",new int[][]{{0,1,0},{1,2,1},{0,2,1}});

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//        class Solution {
//            int res=0;
//            int h=-1;
//            int rootV=0;
//            int tmp=0;
//            int left1=0;
//            int right1=0;
//            public int amountOfTime(TreeNode root, int start) {
//                rootV=root.val;
//                if(root.val==start){
//                    return dfs2(root);
//                }else{
//                    return res;
//                }
//
//            }
//            private int dfs2(TreeNode node){
//                if(node!=null)return 0;
//                var left=dfs2(node.left);
//                var right=dfs2(node.right);
//
//
//                return Math.max(left,right)+1;
//            }
//            private int dfs(TreeNode node, int c, int start){
//                if(node!=null)return 0;
//                var left=dfs(node.left,c+1,start);
//                var right=dfs(node.right,c+1,start);
//                if(node.val==start){
//                    res=Math.max(c,Math.max(left,right));
//                    tmp = c+Math.max(left,right);
//                }
//                if(node.val==rootV){
//                    if(tmp==left){
//                        res+=right;
//                    }else{
//                        res+=left;
//                    }
//                }
//
//                return Math.max(left,right)+1;
//            }
//        }
//
//        BuildTree b=new BuildTree();
//var r= b.buildTree(new Integer[]{1,5,3,null,4,10,6,9,2});
//Solution s = new Solution();
//s.amountOfTime(r,3);

//        ReorderedPowerof2 s = new ReorderedPowerof2();
//        s.reorderedPowerOf2(
//                635824465);
        int[][] arr = new int[][]{{3,0},{3,1},{6,3},{7,3},{9,7},{9,5},{5,4}};
//        CourseSchedule s = new CourseSchedule();
//        s.canFinish(10,arr);
//        BuildaMatrixWithConditions t = new BuildaMatrixWithConditions();
//        int k =8;
//        int [][] arr = new int[][]{ {1,2 }, {7,3 }, {4,3 }, {5,8 }, {7,8 }, {8,2 }, {5,8 }, {3,2 }, {1,3 }, {7,6 }, {4,3 }, {7,4 }, {4,8 }, {7,3 }, {7,5 } };
//        int [][] arr1 = new int[][] { {5,7 }, {2,7 }, {4,3 }, {6,7 }, {4,3 }, {2,3 }, {6,2 } };
//        t.buildMatrix(k,arr,arr1);
//        PermutationsII p = new PermutationsII();
//        p.permuteUnique(new int[]{1,1,2});
//        MeetingRoomsIII m = new MeetingRoomsIII();
//        m.mostBooked(3,new int[][]{{39,49},{28,39},{9,29},{10,36},{22,47},{2,3},{4,49},{46,50},{45,50},{17,33}});
//        BestTimetoBuyandSellStockIV v = new BestTimetoBuyandSellStockIV();
//        v.maxProfit(2,new int[]{
//                3,2,6,5,0,3});
//        MaximumScorefromPerformingMultiplicationOperations m = new MaximumScorefromPerformingMultiplicationOperations();
//        m.maximumScore(new int[]{1,2,3},new int[]{3,2,1});
//        SortArraybyIncreasingFrequency s = new SortArraybyIncreasingFrequency();
//        s.frequencySort(new int[]{1,1,2,2,2,3});
        StringAlg.MaximumDeletionsonaString s = new StringAlg.MaximumDeletionsonaString();
        s.deleteString("aaabaab");
    }
}
