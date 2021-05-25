public class Heap {




    public int getMax(int[]arr){
        return arr[0];
    }

    public int getParent(int[]arr, int index){
        return arr[index/2];
    }

    public int getLeftChildren(int[]arr, int index){
        return arr[2*index+1];
    }
    public int getRightChildren(int[]arr, int index){
        return arr[2*index+2];
    }

    // heapify node[index]
    public void heapify(int[]arr, int index, int size) {
        int largestIndex = index;

        if (2 * index + 1 < size && arr[largestIndex] < arr[2 * index + 1]) {
            largestIndex = 2 * index + 1;
        }
        if (2 * index + 2 < size && arr[largestIndex] < arr[2 * index + 2]) {
            largestIndex = 2 * index + 2;
        }
        if (largestIndex != index) {
            int tmp = arr[index];
            arr[index] = arr[largestIndex];
            arr[largestIndex] = tmp;

            heapify(arr, largestIndex,size);
        }

    }
    public void buildHeap(int[]arr){
        for (int i = arr.length/2-1; i >-1 ; i--) {
            this.heapify(arr,i,arr.length);
        }
    }

    public int[] heapSort(int[]arr){
        int[] res=new int[arr.length];

        this.buildHeap(arr);
         for (int size = arr.length; size>0; size--) {
            res[size-1]=this.getMax(arr);
            arr[0]=arr[size-1];

            this.heapify(arr,0,size);
        }
        return res;
    }
}
