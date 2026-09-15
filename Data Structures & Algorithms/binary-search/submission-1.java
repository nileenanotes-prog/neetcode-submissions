class Solution {
    public int search(int[] nums, int target) {
        int front = 0, rear = nums.length - 1, mid;
        while (front <= rear){
            mid = (front + rear) /2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                rear = mid - 1;
            else
                front = mid + 1;
        }

        return -1;

    }
}
