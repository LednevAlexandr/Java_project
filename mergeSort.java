public class mergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 3, 9, 4 };
        mergeS(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeS(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < n - mid; i++) {
            right[i] = arr[i + mid];
        }
        mergeS(left);
        mergeS(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < l && j < r) {
            if (left[i] < right[j]) {
                arr[index] = left[i];
                i++;
            } else {
                arr[index] = right[j];
                j++;
            }
            index++;
        }

        for (int ll = i; ll < l; ll++) {
            arr[index++] = left[ll];
        }
        for (int rr = j; rr < r; rr++) {
            arr[index++] = right[rr];
        }

    }
}
