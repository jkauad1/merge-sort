package LinearSearch;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Exercise1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++ ){
            array[i] = scanner.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n; i++){
            if (k == array[i]){
                found = true;
            }
        }

        if (found == true){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
