

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        // Add all elements
        for (int x : map.keySet()) {
            heap.add(x);
        }

        // Take top k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
    
