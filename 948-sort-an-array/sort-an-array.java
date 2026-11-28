class Solution {
    public int[] sortArray(int[] nums) {
        int size = nums.length;
        int startIndex = (size/2)-1;
        for(int i=startIndex; i>=0; i--){
            heapify(nums, i, size);
        }
        for(int j=size-1; j>0; j--){
            swap(nums, 0, j);
            heapify(nums, 0, j);
        }
        return nums;
    }
    public void swap(int[] arr, int i, int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void heapify(int[] arr, int i, int n){
        int maxindex = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && arr[left] > arr[maxindex]){
            maxindex = left;
        }
        if(right < n && arr[right] > arr[maxindex]){
            maxindex = right;
        }

        if(maxindex != i){
            swap(arr, i, maxindex);
            heapify(arr, maxindex, n);
        }
    }
}