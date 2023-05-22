class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    int[] answer = new int[k];
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    PriorityQueue<Integer> minHeap =
        new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));
    for (int num : frequencyMap.keySet()) {
      minHeap.offer(num);
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }
    for (int i = k - 1; i >= 0; i--) {
      answer[i] = minHeap.poll();
    }
    return answer;
  }
}
