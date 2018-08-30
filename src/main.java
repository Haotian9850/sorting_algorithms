public class main {
    /*testing site of all sorting algorithms*/
    public static void main(String[] args){

        System.out.println("------------------- merge sort testing ---------------------");
        int[] testArray = new int[]{224, 2, 23, 56, 4564, 23, 55, 59, 888, 1204, 29, 8, 77, 65, 43};
        mergeSorter m = new mergeSorter();
        m.sortAndVisualize(testArray);

        System.out.println("-------------------selection sort testing -------------------");
        int[] testArray1 = new int[]{224, 2, 23, 56, 4564, 23, 55, 59, 888, 1204, 29, 8, 77, 65, 43};
        selectionSorter s = new selectionSorter();
        s.sortAndVisualize(testArray1);

        System.out.println("-------------------insertion sort testing -------------------");
        int[] testArray2 = new int[]{224, 2, 23, 56, 4564, 23, 55, 59, 888, 1204, 29, 8, 77, 65, 43};
        insertionSorter i = new insertionSorter();
        i.sortAndVisualize(testArray2);

        System.out.println("-------------------bubble sort testing -------------------");
        int[] testArray3 = new int[]{224, 2, 23, 56, 4564};
        bubbleSorter b = new bubbleSorter();
        b.sortAndVisualize(testArray3);

        System.out.println("-------------------quick sort testing -------------------");
        int[] testArray4 = new int[]{224, 2, 23, 56, 4564, 23, 55, 59, 888, 1204, 29, 8, 77, 65, 43};
        quickSorter q = new quickSorter();
        q.sortAndVisualize(testArray4);

        System.out.println("-------------------heap sort testing -------------------");
        int[] testArray5 = new int[]{224, 2, 23, 56, 4564, 23, 55, 59, 888, 1204, 29, 8, 77, 65, 43};
        heapSorter h = new heapSorter();
        h.sortAndVisualize(testArray5);
    }

}
