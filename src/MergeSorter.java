/*
* Merge sort implementation of an int[]
*   A divide and conquer strategy...
* */

public class MergeSorter {
    public MergeSorter(){
        //empty constructor
    }

    /*merge sort an int[]. DOES NOT MODIFY ORIGINAL INPUT ARRAY!*/
    public int[] sort(int[] a){
        int[] result = a;
        sort(result, 0, a.length - 1);
        return result;
    }

    /*utility method for sort*/
    private void sort(int[] a, int left, int right){
        if (left < right){
            int middle = left + (right - left) / 2;
            sort(a, left, middle);
            sort(a, middle + 1, right);
            merge(a, left, middle, right);
        }
    }

    /*merge sort an int[] and visualize the process. MODIFIES ORIGINAL INPUT ARRAY!*/
    public void sortAndVisualize(int[] a){
        sortAndVisualize(a, 0, a.length - 1);
    }

    /*utility method for sortAndVisualize*/
    public void sortAndVisualize(int[] a, int left, int right){
        if (left < right){
            int middle = left + (right - left) / 2;
            sortAndVisualize(a, left, middle);
            sortAndVisualize(a, middle + 1, right);
            merge(a, left, middle, right);
            printArray(a);
        }
    }

    /*merge two already sorted sub-arrays*/
    private void merge(int[] a, int left, int middle, int right){
        int leftLen = middle - left + 1;
        int rightLen = right - middle;
        int[] leftArray = new int[leftLen];
        int[] rightArray = new int[rightLen];

        /*move data into left and right sub-arrays*/
        for(int i = 0; i < leftLen; i ++){
            leftArray[i] = a[left + i];
        }
        for(int j = 0; j < rightLen; j ++){
            rightArray[j] = a[middle + 1 + j];
        }

        /*merge two sub-arrays*/
        int ptr = left;
        int leftIndex = 0;
        int rightIndex = 0;
        while(leftIndex < leftLen && rightIndex < rightLen){
            if(leftArray[leftIndex] < rightArray[rightIndex]){
                a[ptr] = leftArray[leftIndex];
                leftIndex ++;
            }else{
                a[ptr] = rightArray[rightIndex];
                rightIndex ++;
            }
            ptr ++;
        }
        /*dump remaining elements in left / right sub-array*/
        while(leftIndex < leftLen){
            a[ptr] = leftArray[leftIndex];
            leftIndex ++;
            ptr ++;
        }
        while(rightIndex < rightLen){
            a[ptr] = rightArray[rightIndex];
            rightIndex ++;
            ptr ++;
        }
    }


    /*visualize an int[] to console in specified index range*/
    private void printArray(int[] a){
        System.out.println();   //new line separator
        System.out.print("[");
        for(int i = 0; i < a.length - 1; i ++){
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1] + "]");
        System.out.println();   //new line separator
    }
}
