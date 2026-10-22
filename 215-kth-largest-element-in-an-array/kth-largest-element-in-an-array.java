class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int size = nums.length;
        for(int i=0; i<k; i++){
            pq.add(nums[i]);
        }

        for(int j=k; j<size; j++){
            if(nums[j] > pq.peek()){
                pq.poll();
                pq.add(nums[j]);
            }
        }
        return pq.peek();
    }
}