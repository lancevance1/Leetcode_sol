package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        this.graph = buildGraph(numCourses, prerequisites);
        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i, vis, path);
        }
        return !cycle;
    }

    List<Integer>[] graph;

    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
        for (var c : prerequisites) {
            graph[c[1]].add(c[0]);
        }
        return graph;
    }

    boolean cycle = false;

    private void dfs(List<Integer>[] graph, int node, boolean[] vis, boolean[] path) {
        if (path[node]) {
            cycle = true;
            return;
        }
        if (vis[node]) {
            return;
        }
        if (cycle) {
            return;
        }
        vis[node] = true;
        path[node] = true;
        for (var c : graph[node]) {
            dfs(graph, c, vis, path);
        }
        path[node] = false;
    }
    //tc:o(e+v);sc:o(e+v)
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        List<Integer>[] graph = buildGraph(numCourses,prerequisites);
//        int[] indegree = new int[numCourses];
//        for(var c:prerequisites){
//            indegree[c[0]]++;
//        }
//        Queue<Integer> q = new LinkedList();
//        for(int i=0;i<indegree.length;i++){
//            if(indegree[i]==0){
//                q.add(i);
//            }
//        }
//        int count=0;
//        while(q.size()!=0){
//            count++;
//            var tmp=q.remove();
//            for(var c: graph[tmp]){
//                indegree[c]--;
//                if(indegree[c]==0)
//                    q.add(c);
//            }
//        }
//
//        return count==numCourses;
//    }
//
//    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
//        List<Integer>[] graph = new LinkedList[numCourses];
//        for(int i=0;i<graph.length;i++){
//            graph[i]=new LinkedList();
//        }
//        for(var c: prerequisites){
//            graph[c[1]].add(c[0]);
//        }
//        return graph;
//    }
}
