public class Main {

    public static void main(String[] args) {
        // Creating an array
        int[] arr = {1, 10, 5, 9, 8, 0, 10};

        sort(arr, 0, arr.length - 1);

        // Printing the array
        for (int i1 : arr) System.out.print(i1 + " ");
    }

    private static void sort(int[] arr, int low, int high) {
        // Checking low isn't bigger than high to avoid StackOverflowError
        // caused of infinite recursion
        if (low < high) {
            // pivot is the partitioning index that is going to be in its right place
            int pivot = partition(arr, low, high);

            // Sorting the array before and after partition
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // index of smaller element abd indicates the right position
        // of the pivot
        int pivot = arr[high], index = low - 1;

        for (int j = low; j <= high - 1; j++)
            // every element that is smaller than the pivot will be on the left of it
            if (arr[j] <= pivot) {
                index++;
                swap(arr, index, j);
            }

        // putting pivot in its right place
        swap(arr, index + 1, high);
        return (index + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        // temp is a temporarily used variable to swap two elements
        // i and j are indices of two elements in the array we are sorting
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
