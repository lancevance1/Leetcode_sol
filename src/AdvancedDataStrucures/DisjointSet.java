package AdvancedDataStrucures;

//tc:O(alpha(n)) where alpha(n) is the inverse Ackermann function, approximately O(1). sc:O(n)
public class DisjointSet {
    int[] parent;
    int count;

    public DisjointSet(int n) {
        // n >= 0
        this.count = 0;
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            this.parent[i] = -1;
        }
    }

    //check if the node is in parent[]
    public boolean isValid(int x) {
        if (x < 0 || x >= this.parent.length) return false;
        return this.parent[x] != -1;
    }

    //set parent of x if x parent is -1
    public void setParent(int x) {
        if (!this.isValid(x)) {
            this.parent[x] = x;
            this.count++;
        }
    }

    public int find(int x) {
        //compressed tree height,
        //repoint parent nodes of every node in a same tree to the root node.
        if (!this.isValid(x)) return -1;
        if (x != this.parent[x]) {
            this.parent[x] = find(this.parent[x]);
        }
        return this.parent[x];
    }

    // numbers of connected component
    public int count() {
        return this.count;
    }

    // merge two node
    public boolean union(int x, int y) {
        int a = this.find(x), b = this.find(y);
        if (!(this.isValid(a) && this.isValid(b))) return false;
        if (a == b) return true;
        this.parent[a] = b;
        this.count--;
        return true;
    }
}
