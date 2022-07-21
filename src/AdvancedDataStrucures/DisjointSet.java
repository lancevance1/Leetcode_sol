package AdvancedDataStrucures;

//tc:O(alpha(n)) where alpha(n) is the inverse Ackermann function, approximately O(1). sc:O(n)
public class DisjointSet {
    int[] parent;
    int count;

    public DisjointSet(int n) {
        this.count = 0;
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            this.parent[i] = -1;
        }
    }

    //check if the node is in parent[]
    public boolean isValid(int x) {
        return this.parent[x] != -1;
    }

    //set parent of x if x parent is -1
    public void setParent(int x) {
        if(!this.isValid(x)){
            this.parent[x] = x;
            this.count++;
        }
    }

    public int find(int x) {
        //compressed tree height, repoint parent nodes of every node in a same tree to the root node.
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
    public void union(int x, int y) {
        if (this.find(x) == this.find(y)) return;
        this.parent[this.find(x)] = this.find(y);
        this.count--;
    }
}
