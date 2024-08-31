package Main;

import static Classes.CountingSort.countingSort;

public class CountingSortTest {
    public static void main(String[] args) {
        int[] lista = {5,2,6,2,9,1,0,3,6,8,0};
        int[] listaOrdenada = new int[lista.length];
        int maximo = 9 + 1;

        countingSort(lista, listaOrdenada, maximo);

        for (int i = 0; i < listaOrdenada.length; i++){
            System.out.println(listaOrdenada[i]);
        }
    }
}
