class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

         int[] indeg = new int[numCourses];
        // graph[i] = courses that can be taken after completing course i
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int[] pre : prerequisites) {

            int course = pre[0];
            int prerequisite = pre[1];

            // prerequisite -> course
            graph.get(prerequisite).add(course);

            // course has one prerequisite
            indeg[course]++;
        }

       

        // // Calculate indegree
        // for (int i = 0; i < numCourses; i++) {
        //     for (int course : graph.get(i)) {
        //         indeg[course]++;
        //     }
        // }

        return bfs(indeg, graph);
    }

    public boolean bfs(int[] indeg, List<List<Integer>> graph) {

        Queue<Integer> q = new LinkedList<>();

        // Courses with no prerequisites
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.offer(i);
            }
        }

        int count = 0;

        while (!q.isEmpty()) {

            int node = q.poll();
            count++;

            // Complete this course.
            // Now its dependent courses have one
            // fewer prerequisite.
            for (int next : graph.get(node)) {

                indeg[next]--;

                if (indeg[next] == 0) {
                    q.offer(next);
                }
            }
        }

        return count == indeg.length;
    }
}