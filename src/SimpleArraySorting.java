/**
 * SimpleArraySorting
 */
public class SimpleArraySorting {

    public static void main(String[] args) {
        int[] myArray = { 23, 98, 65, 66, 23, 11, 05, 43, 39 };
        // Display unsorted array
        System.out.print("Unsorted Array of Int - ");
        for (int array : myArray) {
            System.out.print(array + " ");
        } // Send array to get sorted
          // then display it.
        doSimpleSorting(myArray);
        System.out.print("\nSorted Array of Int - ");
        for (int array : myArray) {
            System.out.print(array + " ");
        }
        System.out.print("\n-------------------------------------------");
        String[] arrayObj = {"Dina", "Tim", "Thomas","Zach","Abby","Theodore","Sarah","Jerelyn"};
        //Display unsorted array
        System.out.print("\nUnsorted Array of Objects : ");
        for (String string : arrayObj) {
            System.out.print(string + " ");
        }//send array objects to get sorted then display them
        doSimpleSortingObjects(arrayObj);
        System.out.print("\nSorted Array of Objects : ");
        for (String array : arrayObj) {
            System.out.print(array + " ");
        }
        System.out.print("\n-------------------------------------------");

    }

    private static void doSimpleSorting(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
    private static void doSimpleSortingObjects(Comparable[] array) {
        boolean sorted = false;
        Comparable temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i+1])>0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
