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
//        Sort test = new Sort();
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
        ReverseLinkedList.ListNode node1 = new ReverseLinkedList.ListNode(1);
        ReverseLinkedList.ListNode node2 = new ReverseLinkedList.ListNode(2);
        ReverseLinkedList.ListNode node3 = new ReverseLinkedList.ListNode(3);
        node1.next =node2;
        node2.next = node3;
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        while(node3!=null){
            System.out.println(node3.val);
        node3=node3.next;
    }

    }

}
