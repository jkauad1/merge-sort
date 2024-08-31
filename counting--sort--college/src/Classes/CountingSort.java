package Classes;

public class CountingSort {
    public static void countingSort(int[] lista, int[] listaOrdenada, int maximo){
        int[] listaAuxiliar = new int[maximo];

        for (int i = 0; i < maximo; i++){
            listaAuxiliar[i] = 0;
        }

        for (int j = 0; j < lista.length; j++){
            listaAuxiliar[lista[j]]++;
        }

        for (int i = 1; i < maximo; i++){
            listaAuxiliar[i] += listaAuxiliar[i - 1];
        }

        for (int j = lista.length - 1; j >= 0; j--){
            listaOrdenada[listaAuxiliar[lista[j]] - 1] = lista[j];
            listaAuxiliar[lista[j]]--;
        }
    }
}
