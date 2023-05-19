class Solution {
  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    // seems like we need to find all the source nodes
    int[] edgesIn = new int[n];
    List<Integer> answer = new LinkedList<>();
    for (List<Integer> pair : edges) {
      edgesIn[pair.get(1)]++;
    }
    for (int i = 0; i < n; i++) {
      if (edgesIn[i] == 0) {
        answer.add(i);
      }
    }
    return answer;
  }
}
