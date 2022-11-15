package Graph;

public class MostStonesRemovedwithSameRoworColumn {
    //tc:O(alpha(n)*n^2), sc:O(n)
    public int removeStones(int[][] stones) {
        UnionFind uf = new UnionFind(stones);
        for (int i = 1; i < stones.length; i++) {
            for (int j = 0; j < i; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    uf.union(i, j);
                }
            }
        }
        return stones.length - uf.size;
    }


    public class UnionFind {
        int[] arr;
        int size;

        UnionFind(int[][] stones) {
            this.arr = new int[stones.length];
            for (int i = 0; i < arr.length; i++) {
                this.arr[i] = i;
            }
            this.size = stones.length;
        }

        public int find(int x) {
            if (arr[x] != x) arr[x] = find(arr[x]);
            return arr[x];
        }

        public void union(int a, int b) {
            if (find(a) == find(b)) return;
            if (size != 1) size--;
            arr[find(a)] = find(b);
        }
    }
}
