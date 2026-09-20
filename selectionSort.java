class selectionSort {

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {7, 8, 3, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            swap(arr, i, smallest);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}