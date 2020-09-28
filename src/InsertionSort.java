public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 1, -5, 3, 7, 4, 18, 10};
//        int[] arr = {3, 4, 5, 2, 1};
        System.out.println("_= INSERTION SORT =_");
        System.out.println(" == Before sort == ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSort(arr);
//        selectionSort(arr);
        System.out.println();
        System.out.println(" == After all sort == ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > currentElement; j--) {
                System.out.println();
                System.out.println("(Swap " + array[j + 1] + " with " + array[j] + ")");
                array[j + 1] = array[j];
            }
            array[j + 1] = currentElement;
            System.out.println();
            System.out.println("** Array after the " + i + " sort ** ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }

//    public static void selectionSort(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            int currentMin = array[i];
//            int currentMinIndex = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (currentMin > array[j]) {
//                    currentMin = array[j];
//                    currentMinIndex = j;
//                }
//
//            }
//            if (currentMinIndex != i) {
//                array[currentMinIndex] = array[i];
//                array[i] = currentMin;
//                System.out.println("Swap " + array[currentMinIndex] + " with " + array[i]);
//            }
//            System.out.println();
//            System.out.println("* Array after the " + i + " sort: ");
//            for (int k = 0; k < array.length; k++) {
//                System.out.print(array[k] + " ");
//            }
//            System.out.println();
//        }
//    }
}
