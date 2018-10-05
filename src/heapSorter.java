import java.util.PriorityQueue;

/*Heap sort an int[]
* Utilizes Java built-in PriorityQueue as underlying data structure*/
public class heapSorter {
    public heapSorter(){
        //empty constructor
    }

    /*Heap sort an int[]. DOES NOT MODIFY INPUT ARRAY!*/
    public  int[] sort(int[] a){
        //in-place sort
        int[] result = new int[a.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        for(Integer i : a){
            minHeap.add(i);
        }
        for(int i = 0; i < a.length; ++ i){
            result[i] = minHeap.poll();
        }
        return result;
    }

    /*Heap sort an int[] and visualize the process. MODIFIES INPUT ARRAY!
    * Since heap sort is not in-place, only the original and result array will be visualized.*/
    public void sortAndVisualize(int[] a){
        printArray(a);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for(Integer i : a){
            heap.offer(i);
        }
        for(int i = 0; i < a.length; i ++){
            a[i] = heap.peek();
            heap.remove(a[i]);
        }
        printArray(a);
    }



    /*visualization of an int[]*/
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
