class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new LinkedList<>();
        int[] calcs = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1;i++) {
            int difference = arr[i+1]-arr[i];
            if (difference < min) {
                answer = new LinkedList<>();
                min = difference;
            }
            if (difference == min) {
                answer.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return answer;
    }
}
