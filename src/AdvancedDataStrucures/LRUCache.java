package AdvancedDataStrucures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//public class LRUCache {
//
//    Map<Integer, Node> map;
//
//    class Node {
//        int val;
//        int key;
//        Node next;
//        Node pre;
//
//        Node(int key, int val, Node pre) {
//            this.key = key;
//            this.val = val;
//            this.pre = pre;
//        }
//    }
//
//    Node dummy;
//    Node cur;
//
//    int size;
//
//    public LRUCache(int capacity) {
//        this.map = new HashMap<>();
//        this.size = capacity;
//        this.dummy = new Node(-1, -1, null);
//        this.cur = dummy;
//
//    }
//
//    public int get(int key) {
//        if (!this.map.containsKey(key)) return -1;
//        var node = this.map.get(key);
//        if (node == cur) return node.val;
//        this.remove(node);
//        cur.next = node;
//        node.pre = cur;
//        cur = node;
//
//        return node != null ? node.val : -2;
//    }
//
//    private void remove(Node node) {
//        if (node == cur) {
//            cur = cur.pre;
//        }
//        var pre = node.pre;
//        pre.next = node.next;
//        if (node.next != null) node.next.pre = pre;
//        node.pre = null;
//        node.next = null;
//
//
//    }
//
//    public void put(int key, int value) {
//        if (this.map.containsKey(key)) {
//            this.map.get(key).val = value;
//            this.get(key);
//            return;
//        }
//        if (this.map.size() == this.size) {
//            //pop
//            this.map.remove(dummy.next.key);
//            this.remove(dummy.next);
////            if(cur==dummy.next){
////                cur=dummy;
////            }
//        }
//        this.cur.next = new Node(key, value, cur);
//        this.cur = this.cur.next;
//        this.map.put(key, cur);
//    }
//}
public class LRUCache {
    private LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}