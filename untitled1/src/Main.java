public class Main {
    public static void main(String[] args) {

        }

    public static void mergeSort(int[] array, int left, int right){

        if (left > right){
            return;
        }

        else {

            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {

        int[] auxiliarArray = new int[array.length];

        for (int i = left; i <= right; i++){
            auxiliarArray[i] = array[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right){

            if (auxiliarArray[i] <= auxiliarArray[j]){
                array[k] = auxiliarArray[i];
                i++;
            } else {
                array[k] = auxiliarArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle){
            array[k] = auxiliarArray[i];
            i++;
            k++;
        }
    }
    }