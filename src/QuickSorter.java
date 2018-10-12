/*Quick sort an int[]
*   A divide and conquer approach: */
public class QuickSorter {
    public QuickSorter(){
        //empty constructor
    }

    /*quick sort an int[]. DOES NOT MODIFY ORIGINAL INPUT ARRAY!*/
    public int[] sort(int[] array){
        int[] a = array;
        partition(a, 0, a.length - 1);
        return a;
    }

    /*quick sort an int[]. MODIFIES ORIGINAL INPUT ARRAY!*/
    public void sortAndVisualize(int[] a){
        partitionAndVisualize(a, 0, a.length - 1);
    }

    /*utility method for sort*/
    private void partition(int[] a, int low, int high){
        int i = low;
        int j = high;
        int pivotElement = a[(i + j) / 2];

        while(i < j){
            while(a[i] < pivotElement){
                i ++;
            }
            while(a[j] > pivotElement){
                j --;
            }
            if(i <= j){
                swap(a, i, j);
                i ++;
                j --;
            }
        }
    //recursive calls
        if(low < j){
            partition(a, low, j);
        }
        if(i < high){
            partition(a, i, high);
        }
    }

    /*utility method for sortAndVisualize*/
    private void partitionAndVisualize(int[] a, int low, int high){
        int i = low;
        int j = high;
        int pivotElement = a[(i + j) / 2];

        while(i < j){
            while(a[i] < pivotElement){
                i ++;
            }
            while(a[j] > pivotElement){
                j --;
            }
            if(i <= j){
                swap(a, i, j);
                i ++;
                j --;
            }
            printArray(a);
        }
        //recursive calls
        if(low < j){
            partitionAndVisualize(a, low, j);
        }
        if(i < high){
            partitionAndVisualize(a, i, high);
        }
    }

    /*utility method for partition: swap two elements in an int[]*/
    private void swap(int[] a, int i, int j){
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
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
