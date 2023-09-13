package weirdalgorithm;

import java.util.ArrayList;
import java.util.List;

/* 
 * Consider an alorithm that takes as input a 
 * positive integer n. If n is even, the algorithm
 * divides it by two, and if n is odd, the algorithm
 * divides by three and adds one. The algorithm repeats
 * this, until n is one. For example, the sequence for
 * n = 3 is as follows:
 * 
 * 3 > 10 > 5 > 16 > 8 > 4 > 2 > 1
 * the task is to simulate the execution of the algorithm
 * for a given value of n.
*/

public class WeirdAlgororithm {
    public static void main(String[] args) {

        System.out.println(wAlgororithm(3).toString());

    }

    public static List<Integer> wAlgororithm(int n) {

        List<Integer> lista = new ArrayList<>();
        while (n != 1) {
            lista.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        lista.add(n);
        return lista;
    }
}
