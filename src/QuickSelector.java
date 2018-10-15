import java.util.Random;

public class QuickSelector {
    //returns index of k-th order statistic in an unsorted array

    public QuickSelector() {
    }

    public int select(int[] nums, int k){
        //returns index of k-th order statistic in an unsorted array
        int left = 0;
        int right = nums.length - 1;
        Random rand = new Random();
        while(right >= left){
            int pivotIndex = partition(nums, left, right, rand.nextInt(right - left + 1) + left);
            if(pivotIndex == k){
                return nums[pivotIndex];
            }else if(pivotIndex < k){
                left = pivotIndex + 1;
            }else{
                right = pivotIndex - 1;
            }
        }
        return Integer.MAX_VALUE;
    }

    //partition in quick select: use right most element as pivot
    private int partition(int[] nums, int left, int right, int pivot){
        int pivotVal = nums[pivot];
        swap(nums, right, pivot);
        int ptr = left;
        for(int i = left; i < right; ++ i){
            if(nums[i] < pivotVal){
                swap(nums, i, ptr);
                ++ ptr;
            }
        }
        swap(nums, right, ptr);
        return ptr;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
