class quickSort {

    public static int partition(int a[], int low, int high) {
        int p = a[high]; // pivot element
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (a[j] < p) {
                i++;

                // swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        i++;

        // put pivot in its correct position
        int temp = a[i];
        a[i] = a[high];
        a[high] = temp;

        return i;
    }

    public static void quicksort(int a[], int low, int high) {

        if (low < high) {

            int pivot = partition(a, low, high);

            quicksort(a, low, pivot - 1);
            quicksort(a, pivot + 1, high);
        }
    }

    public static void main(String[] args) {

        int a[] = {3, 4, 2, 6, 8, 9, 5};

        int n = a.length;

        quicksort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("");
    }
}